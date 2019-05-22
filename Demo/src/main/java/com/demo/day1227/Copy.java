package com.demo.day1227;

import java.io.*;

/**
 * @ClassName Copy
 * @Auther trappedBeast
 * @Date 2018/12/28 11:13
 * @Version 1.0
 * @Description TODO
 **/
public class Copy {
    public static void main(String[] args) throws IOException {
        if (args.length!=2){//参数不是两个
            System.out.println("操作语法不正确，应该输入正确的文件路径");
            System.out.println("eg: java Copy 源文件路径 目标文件路径");
            System.out.println(1);//系统退出
        }
        if(args[0].equals(args[1])){
            System.out.println("无法复制自身文件");
            System.out.println(1);
        }
        File file = new File(args[0]);
        if(file.exists()){
            File file1 = new File(args[1]);//找到目标文件地址
            InputStream input=new FileInputStream(file);//输入流
            OutputStream output=new FileOutputStream(file1);//输出流
            int temp=0;
            while ((temp=input.read())!=-1){  //表示还有内容还在读
                output.write(temp);

            }
            System.out.println("文件复制成功");
            input.close();
            output.close();
        }else{
            System.out.println("源文件不存在");
        }

    }
}
    