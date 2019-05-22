package com.demo.day1119;

/**
 * @ClassName Demo
 * @Auther trappedBeast
 * @Date 2018/11/19 17:28
 * @Version 1.0
 * @Description TODO
 **/
public class Demo {

    public void finalize(){
        System.out.println("ok");
    }
    public static void main(String[] args) {
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        new Demo();
        System.gc();
        System.out.println("helloWorld");

    }
}
    