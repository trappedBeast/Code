package com.demo.day1227;

import com.sun.istack.internal.NotNull;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Logger;

/**
 * @ClassName JdbcDemo
 * @Auther trappedBeast
 * @Date 2018/12/26 11:31
 * @Version 1.0
 * @Description TODO
 **/
public class JdbcManager<T> {
    private static Logger logger = Logger.getLogger("com.FirstDemo.day1227.JdbcManager");
    private String fileName;
    private static String dirve;
    private static String url;
    private static String userName;
    private static String passWord;
    private Connection conn=null;
    private Statement state=null;
    private ResultSet res=null;
    private PreparedStatement pre=null;




    /**
     * @Author trappedBeast
     * @Description //有参构造方法
     * @Date 2018/12/26 16:49
     * @Param [fileName]
     * @return
     */
    public JdbcManager(@NotNull String fileName) {
        Properties properties = JdbcManager.newProperties(fileName);
        dirve = properties.getProperty("dirve");
        url = properties.getProperty("url");
        userName = properties.getProperty("userName");
        passWord = properties.getProperty("passWord");
    }



    


    /**
     * @Author trappedBeast
     * @Description //获取数据库连接对象
     * @Date 2018/12/26 16:50
     * @Param []
     * @return Connection
     */
    public  Connection getConnection(){

        try {
            Class.forName(dirve);
            this.conn= DriverManager.getConnection(url,userName,passWord);
            this.conn.setAutoCommit(false);
        } catch (ClassNotFoundException e) {
            logger.info(e+"数据库驱动类无法被找到");
        } catch (SQLException e) {
            logger.info(e+"数据库连接异常");
        }

        return this.conn;
    }

    /**
     * @Author trappedBeast
     * @Description //数据库关闭连接
     * @Date 2018/12/26 17:36
     * @Param []
     * @return void
     */
    public void endConnection(){
        if(res!=null){
            try {
                res.close();
            } catch (SQLException e) {
                logger.info(e+"ResultSet资源关闭异常");
            }
        }
        if(state!=null){
            try {
                state.close();
            } catch (SQLException e) {
                logger.info(e+"Statement资源关闭异常");
            }
        }
        if(conn!=null) {
            try {
                conn.close();
            } catch (SQLException e) {
                logger.info(e+"数据库关闭连接异常");
            }
        }
    }
    /**
     * @Author trappedBeast
     * @Description //数据库操作，增删改
     * @Date 2018/12/26 18:21
     * @Param [sql]
     * @return boolean
     */
    public int operationDb(String sql){
        this.getConnection();
        int executeflag=0;

        try {
            state = conn.createStatement();
            executeflag = state.executeUpdate(sql);

        } catch (SQLException e) {
            logger.info(e+"数据库操操作出现异常");
        }

        this.endConnection();
        return executeflag;
    }


    public int operationDb(String sql,String [] str) throws SQLException {
        this.getConnection();
        int executeflag=0;

        try {
            pre = conn.prepareStatement(sql);
            for (int i = 0; i < str.length; i++) {
                pre.setString(i+1,str[i]);
            }
            executeflag = pre.executeUpdate();
            conn.commit();
        } catch (SQLException e) {
            conn.rollback();
            logger.info(e+"数据库操操作出现异常");
        }

        this.endConnection();
        return executeflag;
    }

    /**
     * @Author trappedBeast
     * @Description //应该定义成抽象方法，让不同类继承重写自己的查询方法,批处理
     * @Date 2018/12/27 11:54
     * @Param [sql, ts]
     * @return int
     */
    public int operationDb(String sql,T[] params){
        this.getConnection();
        int[] executeflag=null;

        try {
            pre = conn.prepareStatement(sql);
            for (int i = 0; i < params.length; i++) {

                pre.addBatch();
            }

            executeflag = pre.executeBatch();


        } catch (SQLException e) {
            logger.info(e+"数据库操操作出现异常");
        }

        this.endConnection();
        return executeflag.length;
    }


    public List<T> queryDb(String sql){
        List<T> list=null;
        this.getConnection();
        boolean executeflag=false;

        try {
            state = conn.createStatement();
            res=state.executeQuery(sql);
            list=new ArrayList<>();
        } catch (SQLException e) {
            logger.info(e+"数据库操操作出现异常");
        }

        this.endConnection();
        return list;

    }



    /**
     * @Author trappedBeast
     * @Description //通过Properties类获取配置文件的Properties对象
     * @Date 2018/12/26 16:48
     * @Param [fileName]配置文件的文件名称
     * @return java.util.Properties
     */
    private static Properties newProperties(String fileName) {
        InputStream in = null;
        Properties pro = null;
        try {
            in = JdbcManager.class.getClassLoader().getResourceAsStream(fileName);
            if(null==in){
                logger.info(fileName+"文件不存在");
                return pro;

            }
            pro = new Properties();
            pro.load(in);
            in.close();
        } catch (FileNotFoundException e) {
            logger.info(e+"文件不存在");
        } catch (IOException e) {
            logger.info(e+"文件流异常");
        }
        return pro;

    }


    public void ceshi(){
        System.out.println(dirve);
        System.out.println(url);
    }




}
    