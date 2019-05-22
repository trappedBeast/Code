package com.demo.day1024;

/**
 * @ClassName InterfaceImp
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/10/26 14:43
 * @Version 1.0
 **/
public abstract class InterfaceImp implements InterfaceOne, InterfaceTwo {
    @Override
    public void abstractMethod() {
        System.out.println("覆盖重写了接口的抽象方法");
    }

    @Override
    public void defaultMethod() {
        System.out.println("覆盖重写了接口的默认方法");

    }
}
    