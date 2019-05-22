package com.newStart2019.day0503;

/**
 * @ClassName App
 * @Auther trappedBeast
 * @Date 2019/5/3 22:19
 * @Version 1.0
 * @Description TODO
 **/
public class App {
    public static void main(String[] args) {
        Outer.Inner1 inner1=new Outer().new Inner1();
        inner1.say();
        Outer.Inner2 inner2=new Outer.Inner2();
        inner2.say();
        new Outer().mewInstance();
        new Outer().method();






    }
}
    