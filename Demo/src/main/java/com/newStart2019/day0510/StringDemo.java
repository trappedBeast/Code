package com.newStart2019.day0510;

/**
 * @ClassName StringDemo
 * @Auther trappedBeast
 * @Date 2019/5/10 11:06
 * @Version 1.0
 * @Description TODO
 **/
public class StringDemo {
    public static void main(String[] args) {
       /* String s1="abc";
        String s2="abc";
        String s3="a"+"b"+"c";
        char[] date={'a','b','c'};
        String s4=new String(date);
        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s4);*/


        StringBuffer sb=new StringBuffer();
        sb.append("1");
        sb.append('c');
        sb.append(2.00F);
        sb.append(2.01);
        sb.append(100L);
        sb.append(true);
        sb.append("abc",1,2);
        sb.append(new char[]{'1','2'});
        sb.append(new char[]{'1','2'},0,1);

        sb.delete(0,1);
        sb.deleteCharAt(0);
        sb.insert(0,"start");
        sb.substring(0,1);
        System.out.println(sb.toString());
        /*System.out.println(sb.length());
        System.out.println(sb.capacity());*/
    }
}
    