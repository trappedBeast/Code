package com.demo.day1113;

/**
 * @ClassName InterfaceDemo
 * @Description
 * @Auther trappedBeast
 * @Date 2018/11/13 10:01
 * @Version 1.0
 **/
/**
 * @Author trappedBeast
 * @Description //TODO 
 * @Date 2018/11/13 10:10
 * @Param 
 * @return 
 **/
public interface InterfaceDemo {
    public abstract void methodAbs();
    void method2();
    public void method3();
    abstract void method4();

    public default void method5(){
        System.out.println("接口默认方法");
    }


    public static void method6(){
        System.out.println("接口静态方法");
    }

}
    