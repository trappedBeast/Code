package com.demo2019.day0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName AddDemo
 * @Auther trappedBeast
 * @Date 2019/1/7 17:04
 * @Version 1.0
 * @Description TODO
 **/
public class AddDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=null;
        buf=new BufferedReader(new InputStreamReader(System.in));
        int i=0;
        int j=0;
        System.out.print("请输入第一个数字:");
        String str1=null;
        str1=buf.readLine();
        i=Integer.parseInt(str1);
        System.out.print("请输入第二个数字:");
        String str2=null;
        str2=buf.readLine();
        j=Integer.parseInt(str2);
        System.out.println("数字相加等于:"+(i+j));
    }
}
    