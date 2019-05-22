package com.demo2019.day0107;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName SystemDemo
 * @Auther trappedBeast
 * @Date 2019/1/7 16:01
 * @Version 1.0
 * @Description TODO
 **/
public class SystemDemo {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=System.in;
        byte [] b=new byte[10];
        System.out.println("请输入内容：");
        int len=inputStream.read(b);
        System.out.println("输入的内容是:"+new String(b,0,len));
    }
}
