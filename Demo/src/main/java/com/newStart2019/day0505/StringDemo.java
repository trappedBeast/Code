package com.newStart2019.day0505;

/**
 * @ClassName StringDemo
 * @Auther trappedBeast
 * @Date 2019/5/6 22:49
 * @Version 1.0
 * @Description TODO
 **/
public class StringDemo {
    public static void main(String[] args) {
        String s1="1";
        String s2="1";
        System.out.println(s1==s2);
        String s3=new String("1");
        String s4=new String("1");
        System.out.println(s3==s1);
        byte[] bytes={95,96,97};
        String s5=new String(bytes);
        System.out.println(s5);



        String s6="a"+"b"+"c";
        String s7="abc";
        System.out.println(s6==s7);
        String s8="ab";
        String s9=s8+"c";
        System.out.println(s7.equals(s9));
        System.out.println(s7==s9);
    }
}
    