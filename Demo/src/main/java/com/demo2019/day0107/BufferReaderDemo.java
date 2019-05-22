package com.demo2019.day0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName BufferReaderDemo
 * @Auther trappedBeast
 * @Date 2019/1/7 16:53
 * @Version 1.0
 * @Description TODO
 **/
public class BufferReaderDemo {
    public static void main(String[] args) throws IOException {
        BufferedReader buf=null;
        buf=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("请输入内容");
        String str=buf.readLine();
        System.out.println(str);



    }
}
    