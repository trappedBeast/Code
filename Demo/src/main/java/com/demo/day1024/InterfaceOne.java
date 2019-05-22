package com.demo.day1024;

/**
 * @ClassName InterfaceOne
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/10/26 14:26
 * @Version 1.0
 **/
public  interface InterfaceOne {
    public void abstractMethod() ;  //接口的抽象方法
    public static void staticMethod(){
        System.out.println("接口的静态方法");
    }

    public default void defaultMethod(){
        System.out.println("接口的默认方法");
    }

    public default void method(){
        System.out.println("接口的method方法");
    }

}
    