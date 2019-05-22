package com.demo.day1222;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName FileDemo
 * @Auther trappedBeast
 * @Date 2018/12/22 22:51
 * @Version 1.0
 * @Description TODO
 **/
public class FileDemo {
    public static void main(String[] args) {
        /*File file = new File("d:\\FirstDemo.txt");

        boolean isDelete = file.delete();
        System.out.println("原有文件"+file.getName()+"删除："+isDelete);
        try {
            boolean isNewFile = file.createNewFile();
            System.out.println(isNewFile);
            if(!isNewFile){
                System.out.println("文件"+file.getName()+"创建失败");
                return;
            }
            System.out.println("文件"+file.getName()+"创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }*/


        File file = new File("d:" + File.separator + "FirstDemo.txt");
        if(file.exists()){
            System.out.println(file.getName()+"文件存在");
            if(file.delete())
                System.out.println("原有文件删除成功");
            else
                System.out.println("文件创建失败");


            return;
        }

        try {

            if(!file.createNewFile()){
                System.out.println("文件创建失败");
            }
            System.out.println("文件创建成功");
            if(file.isFile()){
                System.out.println(file.getName()+"是文件");
            }
            if(!file.isDirectory()){
                System.out.println(file.getName()+"不是文件夹");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String[] list = file.list();
        File[] files = file.listFiles();




    }
}
    