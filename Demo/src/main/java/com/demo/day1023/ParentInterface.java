package com.demo.day1023;

public interface ParentInterface {
    public abstract  void method();
    public void method1();
    abstract void method2();
    void method3();

   //默认方法
    default void defalutMethod(){
        System.out.println("接口默认方法");

    }

    //静态方法
    public static void staticMethod(){
        System.out.println("接口的静态方法");
    }


    //1.9
    /*private void method6(){


    }*/
}
