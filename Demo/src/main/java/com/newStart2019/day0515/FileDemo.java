package com.newStart2019.day0515;

import java.io.File;

/**
 * @ClassName FileDemo
 * @Auther trappedBeast
 * @Date 2019/5/17 16:05
 * @Version 1.0
 * @Description TODO
 **/
public class FileDemo {
    public static void main(String[] args) {
        String loaclPath="C:\\Users\\trappedBeast\\Desktop\\Java Ebook";
        File file = new File(loaclPath);
        System.out.println(file.exists());
        String[] list = file.list();
        System.out.println(list.length);
        for(String s:list){
           if(s.equals("Java 8实战.pdf")){
               new File(loaclPath+File.separator+s).renameTo(new File("C:\\Users\\trappedBeast\\Desktop\\"+File.separator+s));

           }

        }

    }
}
    