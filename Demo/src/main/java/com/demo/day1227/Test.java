package com.demo.day1227;

import java.io.IOException;

/**
 * @ClassName Test
 * @Auther trappedBeast
 * @Date 2018/12/26 15:44
 * @Version 1.0
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) throws IOException {
        /*JdbcManager jdbcManager = new JdbcManager("config.properties");
        String sql = "insert into user_info values(?,?,?)";*/
       /* String [] str={"12","12","1"};
        int i = jdbcManager.operationDb(sql,str);
        System.out.println(i);*/
        /*int i = jdbcManager.operationDb(sql);
        System.out.println(i);*/
        /*String sql="select USER_NO,USER_NAME,USER_TYPE from USER_INFO";
        List<UserInfo> list= jdbcManager.queryDb(sql);
        System.out.println(list.size());*/

        /*UserInfo [] userInfos={new UserInfo("13","13","2"),new UserInfo("14","14","2"),new UserInfo("17","15","2")};
        int i1 = jdbcManager.operationDb(sql,userInfos);
        System.out.println(i1);*/
        int s=5;
        /*System.out.println((s++)+(++s)+(s--)+(--s));*/
        System.out.println(s++);



    }
}
    