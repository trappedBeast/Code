package com.demo.day1108;

import java.io.File;

/**
 * @ClassName FileDemo
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/8 16:16
 * @Version 1.0
 **/
public class FileDemo {
    public static void main(String[] args) {
        File file=new File("D:/../../Demo.txt");
        System.out.println(file.exists());

    }
}
    