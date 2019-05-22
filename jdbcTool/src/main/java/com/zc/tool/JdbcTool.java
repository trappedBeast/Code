package com.zc.tool;

import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.*;
import java.util.Properties;

/**
 * @ClassName JdbcTool
 * @Auther trappedBeast
 * @Date 2019/4/26 16:13
 * @Version 1.0
 * @Description TODO
 **/
@Slf4j
public class JdbcTool implements Serializable {
    private static String user;
    private static String password;
    private static String url;
    private static String dirver;
    private static JdbcTool jdbcTool=null;//实例对象
    private JdbcTool(){}//私有化构造方法



    /**
     * @Author trappedBeast
     * @Date 2019/4/28 9:34
     * @Description //单例获取JDBCTool实例
     */
    public static JdbcTool getSingleJdbcTool(){
        if (null==jdbcTool){
            synchronized (JdbcTool.class){
                if (null==jdbcTool){
                    jdbcTool=new JdbcTool();
                }
            }
        }
        return jdbcTool;
    }

    /**
     * @Author trappedBeast
     * @Date 2019/4/28 0:31
     * @Description //静态代码块初始化成员变量并加载驱动
     */
    static {
        Properties pro=analysisConfigFile("config.properties");
        if (null==pro){
            log.error("pro is null");
        }
        user=pro.getProperty("jdbc.username") != null ? pro.getProperty("jdbc.username") : "";
        password=pro.getProperty("jdbc.password") !=null ? pro.getProperty("jdbc.password") : "";
        url=pro.getProperty("jdbc.url") !=null ? pro.getProperty("jdbc.url") : "";
        dirver=pro.getProperty("jdbc.driver") !=null ? pro.getProperty("jdbc.driver") : "";
        try {
            Class.forName(dirver);
        } catch (ClassNotFoundException e) {
            log.error("系统找不到数据库驱动",e);
        }
    }



    /**
     * @Author trappedBeast
     * @Date 2019/4/28 9:41
     * @Description //解析ConfigFile配置文件
     */

    private static Properties analysisConfigFile(String configName){
        InputStream input=null;
        Properties pro=null;
        input=JdbcTool.class.getClassLoader().getResourceAsStream(configName);
        if(null==input){
            log.error("系统找不到配置文件"+configName);
            return null;
        }
        pro=new Properties();
        try {
            pro.load(input);
            input.close();
        } catch (IOException e) {
            log.error("文件流读取异常",e);
        }
        return pro;
    }

    /**
     * @Author trappedBeast
     * @Date 2019/4/28 0:41
     * @Description //获取数据库连接
     */
    public Connection getConnection(){
        Connection conn=null;
        try {
            conn= DriverManager.getConnection(url,user,password);
            return conn;
        } catch (SQLException e) {
            log.error("数据库连接异常",e);
        }
        return conn;
    }

    /**
     * @Author trappedBeast
     * @Date 2019/4/28 0:50
     * @Description //关闭数据库连接，释放资源
     */

    public void disConnection(ResultSet rs,PreparedStatement ps,Connection conn){
        if (null!=rs){
            try {
                rs.close();
            } catch (SQLException e) {
                log.error("ResultSet资源关闭异常",e);
            }
        }
        if(null!=ps){
            try {
                ps.close();
            } catch (SQLException e) {
                log.error("Statement资源关闭异常",e);
            }
        }
        if(null!=conn) {
            try {
                conn.close();
            } catch (SQLException e) {
                log.error("Connection资源关闭异常",e);
            }
        }
    }
}
    