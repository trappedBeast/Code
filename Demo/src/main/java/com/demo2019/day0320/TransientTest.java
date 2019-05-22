package com.demo2019.day0320;

import java.io.*;

/**
 * @ClassName TransientTest
 * @Auther trappedBeast
 * @Date 2019/3/20 10:32
 * @Version 1.0
 * @Description TODO
 **/
public class TransientTest {

    public static void main(String[] args) {
        User user = new User("trappedBeast","4206241000000000000");
        User.setCountry("Chinese");

        System.out.println("before Serializabled");
        System.out.println("userName:"+user.getUserName());
        System.out.println("idCardNo:"+user.getIdCardNo());
        System.out.println("Country:"+User.getCountry());

        //将对象数据写入文件
        try {
            ObjectOutputStream outputStream=new ObjectOutputStream(new FileOutputStream("d:/user.txt"));
            outputStream.writeObject(user);
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            System.err.println(e);
        }
        System.out.println("--------------------------------------------------");
        //将文件数据读取到对象中
        try {
            ObjectInputStream inputStream=new ObjectInputStream(new FileInputStream("d:/user.txt"));
            user= (User) inputStream.readObject();
            inputStream.close();
        } catch (IOException e) {
            System.err.println(e);
        } catch (ClassNotFoundException e) {
            System.err.println(e);
        }
        System.out.println("after Serializabled");
        System.out.println("userName:"+user.getUserName());
        System.out.println("idCardNo:"+user.getIdCardNo());
        System.out.println("Country:"+User.getCountry());


    }
}
    