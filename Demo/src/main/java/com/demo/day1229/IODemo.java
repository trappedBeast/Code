package com.demo.day1229;

import java.io.File;
import java.io.IOException;

/**
 * @ClassName IODemo
 * @Auther trappedBeast
 * @Date 2018/12/29 10:23
 * @Version 1.0
 * @Description TODO
 **/
public class IODemo {
    public static void main(String[] args) throws IOException {
       /**
        * @Author trappedBeast
        * @Date 2018/12/29 10:35
        * @Description //File 类的常用方法
        */

        /*File file=new File("d:"+File.separator+"FirstDemo.txt");
        file.exists();//判断文件是否存在
        file.isFile();//判断是否是文件
        file.isDirectory();//是否是文件夹
        file.isAbsolute();//判断是否是绝对路径
        file.isHidden();//判断是否是隐藏文件或文件夹
        file.delete();//删除文件或文件夹
        file.list();//返回一个字符串数组，包含该抽象路径下的所有文件和目录的文件路径名
        file.listFiles();//同上，但返回文件
        file.createNewFile();//创建文件
        file.mkdir();//创建目录
        file.mkdirs();//创建所有目录
        file.renameTo(new File(""));//改名
        file.lastModified();//返回最后一次修改时间                                      */


        /*String str="hello world";
        String filePath="d:"+ File.separator+"FirstDemo.txt";
        FileManager.fileWriting(str,filePath);*/

        /*String src="d:"+ File.separator+"FirstDemo.txt";
        String des="d:"+File.separator+"1.txt";
        FileManager.copy(src,des);*/


        File file = new File("d:" + File.separator + "FirstDemo");
        boolean b = file.mkdirs();
        System.out.println(b);


    }
}
    