package com.demo.day1024;

/**
 * @ClassName InterfaceTwo
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/10/26 14:27
 * @Version 1.0
 **/
public interface InterfaceTwo {
    public void abstractMethod() ;  //接口的抽象方法
    public static void staticMethod(){
        System.out.println("接口的静态方法");
    }

    public default void defaultMethod1(){
        System.out.println("接口的默认方法");
    }

}
    