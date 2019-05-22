package com.demo.day1227;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * @ClassName RandomAccressFileDemo
 * @Auther trappedBeast
 * @Date 2018/12/26 11:10
 * @Version 1.0
 * @Description TODO
 **/
public class RandomAccressFileDemo {
    public static void main(String[] args) throws Exception {
        File file = new File("d:" + File.separator + "FirstDemo.txt");
        if (!file.exists()){
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        RandomAccessFile raf=new RandomAccessFile(file,"rw");
        String name="zhengchao";
        String age="18";
        String salary="50K";
        raf.writeBytes(name);
        raf.writeBytes(age);
        raf.writeBytes(salary);
        raf.close();

    }

}
    