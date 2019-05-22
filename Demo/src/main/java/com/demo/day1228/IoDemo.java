package com.demo.day1228;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * @ClassName IoDemo
 * @Auther trappedBeast
 * @Date 2018/12/28 14:57
 * @Version 1.0
 * @Description TODO
 **/
public class IoDemo {
    public static void main(String[] args) {
        String str="hello world";
        ByteArrayOutputStream bos=null;
        ByteArrayInputStream bis=null;
        bis=new ByteArrayInputStream(str.getBytes());
        bos=new ByteArrayOutputStream();
        int temp=0;
        while ((temp=bis.read())!=-1){
            char c=(char)temp;
            bos.write(Character.toUpperCase(c));


        }

        String newStr=bos.toString();
        System.out.println(newStr);
    }
}
    