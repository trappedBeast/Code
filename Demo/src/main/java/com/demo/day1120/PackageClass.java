package com.demo.day1120;

/**
 * @ClassName packageClass
 * @Auther trappedBeast
 * @Date 2018/11/20 9:32
 * @Version 1.0
 * @Description TODO
 **/
public class PackageClass {
    public static void main(String[] args) {
        long start=System.currentTimeMillis();
        String a="110";
        int b=Integer.parseInt(a,16);
        int c=Integer.valueOf(a,16);
        System.out.println(c);
        long end=System.currentTimeMillis();
        System.out.println(end-start);




    }
}
    