package com.newStart2019.day0505;

import java.util.Scanner;

/**
 * @ClassName Demo01
 * @Auther trappedBeast
 * @Date 2019/5/6 23:39
 * @Version 1.0
 * @Description TODO
 **/
public class Demo01 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        for(int i=2;i>=0;i--){

            System.out.println("请输入用户名：");
            String user=scanner.next();
            System.out.println("请输入密码");
            String password=scanner.next();
            if("admin".equals(user) && "admin".equals(password)){
                System.out.println("登陆成功");
                return;
            }
            System.out.println("错误，还有"+i+"次机会");

        }
    }
}
    