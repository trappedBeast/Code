package com.demo2019.day0107;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @ClassName ByteArray
 * @Auther trappedBeast
 * @Date 2019/1/7 10:30
 * @Version 1.0
 * @Description TODO
 **/
public class ByteArray {
    public static void main(String[] args) {
        String str="helloworld";
        ByteArrayInputStream inputStream=null;
        ByteArrayOutputStream outputStream=null;
        inputStream=new ByteArrayInputStream(str.getBytes());
        outputStream=new ByteArrayOutputStream();
        int temp=0;
        while ((temp=inputStream.read())!=-1){
            char c= (char) temp;
            outputStream.write( Character.toUpperCase(c));
        }
        String str1=outputStream.toString();
        System.out.println(str1);
    }
}
    