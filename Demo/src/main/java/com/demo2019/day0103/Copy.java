package com.demo2019.day0103;

import java.io.*;
import java.util.logging.Logger;

/**
 * @ClassName StreamDemo
 * @Auther trappedBeast
 * @Date 2019/1/3 10:55
 * @Version 1.0
 * @Description TODO
 **/
public class Copy {
   private static Logger logger=Logger.getLogger("com.demo2019.day0103.Copy");
    public static void main(String[] args) {
        if(args.length!=2){
            logger.info("操作语法不对，应该输入正确的源文件路径和目标路径");
            System.exit(1);
        }
        if(args[0].equals(args[1])){
            logger.info("无法复制文件自生");
            System.exit(1);
        }
        File file = new File(args[0]);
        if(!file.exists()){
            logger.info("源文件不存在");
            System.exit(1);
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            FileOutputStream fileOutputStream = new FileOutputStream(new File(args[1]));
            int temp=0;
            while ((temp=fileInputStream.read())!=-1){
                fileOutputStream.write(temp);
            }
            logger.info("文件写入成功");
        } catch (FileNotFoundException e) {
            logger.info(e+"");
        } catch (IOException e) {
            logger.info(e+"");
        }


    }
}
    