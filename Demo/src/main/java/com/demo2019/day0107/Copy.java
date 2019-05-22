package com.demo2019.day0107;

import java.io.*;

/**
 * @ClassName Copy
 * @Auther trappedBeast
 * @Date 2019/1/7 10:01
 * @Version 1.0
 * @Description TODO
 **/
public class Copy {
    public static void main(String[] args) throws IOException {
        if(args.length!=2){
            System.out.println("操作语法不正确");
            System.exit(1);
        }
        if (args[0].equals(args[1])){
            System.out.println("无法复制自身文件");
            System.exit(1);
        }
        File file=new File(args[0]);
        if(!file.exists()){
            System.out.println("源文件不存在");
            System.exit(1);
        }
        InputStream inputStream=null;
        OutputStream outputStream=null;
        File file1 = new File(args[1]);
        try {
            inputStream = new FileInputStream(file);
            outputStream = new FileOutputStream(file1);
            int temp=0;
          while ((temp=inputStream.read())!=-1){
              outputStream.write(temp);
          }
            System.out.println("文件复制成功");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(inputStream!=null){
                inputStream.close();
                System.out.println("文件输入流关闭成功");
            }

            if(outputStream!=null){
                outputStream.close();
                System.out.println("文件输出流关闭成功");

            }
        }
    }
}
    