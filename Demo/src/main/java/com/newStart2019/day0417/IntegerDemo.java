package com.newStart2019.day0417;

/**
 * @ClassName Integer
 * @Auther trappedBeast
 * @Date 2019/4/17 14:56
 * @Version 1.0
 * @Description TODO
 **/
public class IntegerDemo {
    public static void main(String[] args) {
        int a=127;
        Integer b=a;
        Integer c=127;
        System.out.println(b==c);


        String s="1";
        String x="1";
        System.out.println(s==x);


        String d="123213";
        Integer integer = Integer.valueOf(d);
        int i = Integer.parseInt(d);
        System.out.println(Integer.valueOf(d));
        System.out.println(Integer.parseInt(d));
    }
}
    