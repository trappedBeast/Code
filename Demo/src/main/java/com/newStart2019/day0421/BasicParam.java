package com.newStart2019.day0421;

/**
 * @ClassName BasicParam
 * @Auther trappedBeast
 * @Date 2019/4/22 10:38
 * @Version 1.0
 * @Description TODO
 **/
public class BasicParam {


    public static void method(int a){
        System.out.println(a);
        int b=++a;
        System.out.println(b);
        System.out.println(a);
    }
    public static void main(String[] args) {
        int x=10;
        BasicParam.method(x);
        System.out.println(x);
    }
}
    