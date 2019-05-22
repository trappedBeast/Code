package com.demo.day1023;

/**
 * @ClassName DemoApp
 * @Description
 * @Auther trappedBeast
 * @Date 2018/10/24 16:31
 * @Version 1.0
 **/
public class DemoApp {
    public static void main(String[] args) {
        ParentInterface interfaceImp1=new InterfaceImp1();
        interfaceImp1.defalutMethod();
        ParentInterface.staticMethod();
    }
}
    