package com.demo.day1106;

/**
 * @ClassName MathDemo
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/7 17:18
 * @Version 1.0
 **/
public class MathDemo {
    public static void main(String[] args) {
        //取绝对值
        System.out.println(Math.abs(3.1));
        System.out.println(Math.abs(3.9));
        System.out.println(Math.abs(-2));
        //向上取整
        System.out.println(Math.ceil(3.1));
        System.out.println(Math.ceil(3.9));
        System.out.println(Math.ceil(3.0));
        //向下取整
        System.out.println(Math.floor(3.1));
        System.out.println(Math.floor(3.9));
        //四舍五入
        System.out.println(Math.round(3.4));
        System.out.println(Math.round(3.5));
    }
}
    