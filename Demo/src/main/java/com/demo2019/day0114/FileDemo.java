package com.demo2019.day0114;

import java.io.*;

/**
 * @ClassName FileDemo
 * @Auther trappedBeast
 * @Date 2019/1/24 10:35
 * @Version 1.0
 * @Description TODO
 **/
public class FileDemo {
    public static void main(String[] args) throws IOException {
        File file = new File("D:\\download\\corejava\\gutenberg");
        /*boolean flag = file.exists();
        if(!flag){
            file.createNewFile();
        }
        PrintStream printStream=new PrintStream(file);
        printStream.println("helloworld");


        File file1 = new File("d:" + File.separator + "Father" );
        InputStream input=new FileInputStream(file);
        OutputStream output=new FileOutputStream(file1+File.separator+file.getName());
        int temp=0;
        while ((temp=input.read())!=-1){
            output.write(temp);
        }*/

        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        File[] files = file.listFiles();
        for (File file1 : files) {
           /* if(file1.getName().toLowerCase().endsWith(".txt")){
                System.out.println(file1.getName().split("\\.")[0]);
            }*/
            System.out.println(file1.getName());
            System.out.println(file1.getPath());
            System.out.println(file1.getParent());
            break;
        }


    }
}
    