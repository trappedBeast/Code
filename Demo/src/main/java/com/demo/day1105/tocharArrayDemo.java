package com.demo.day1105;

/**
 * @ClassName tocharArrayDemo
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/5 17:26
 * @Version 1.0
 **/
public class tocharArrayDemo {
    public static void main(String[] args)  {
        String str = "abc";
        char [] charArray=str.toCharArray();

        byte [] byteArray=str.getBytes();
        for (int i = 0; i < charArray.length; i++) {
            System.out.println(charArray[i]);
        }

        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
        }

        String s = "12 34 56";
        System.out.println(s.replace("2","s"));
        String [] strings=s.split(" ");
        for (String string : strings) {
            System.out.println(string);
        }

        String s1 = "xxx.yyy.zzz";
        String[] split = s1.split("\\.");
        for (String s2 : split) {
            System.out.println(s2);
        }
    }
}
    