package com.zc.tool;

import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @ClassName sqlSessionUtil
 * @Auther trappedBeast
 * @Date 2019/4/10 18:08
 * @Version 1.0
 * @Description TODO
 **/
@Slf4j
public class SqlSessionFactoryUtil {
    private static SqlSessionFactory sqlSessionFactory;
    private static final Class CLASS_LOCK = SqlSessionFactoryUtil.class;
    /**
     * 私有化构造
     */
    private SqlSessionFactoryUtil(){ }

    public static SqlSessionFactory initSqlSessionFactory(){
        String resource="SqlMapConfig.xml";
        Reader reader=null;
        try {
             reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            log.error("配置文件读取出现异常");
        }
        synchronized (CLASS_LOCK){
            if(sqlSessionFactory == null){
                sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        }
        return sqlSessionFactory;
        }

    //创建能执行映射文件中sql的sqlSession
    public static SqlSession getSqlSession(){
        if(null==sqlSessionFactory){
            initSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }





}
    