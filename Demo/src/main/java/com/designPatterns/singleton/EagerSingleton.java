package com.designPatterns.singleton;

/**
 * @ClassName EagerSingleton
 * @Description ：
 * 饿汉式是典型的空间换时间，当类装载的时候就会创建类的实例
 * 不管你用不用，先创建出来，然后每次调用的时候，就不需要再判断，节省了运行时间。
 * @Auther trappedBeast
 * @Date 2018/11/14 10:19
 * @Version 1.0
 **/
public class EagerSingleton {
    //自己创建实例
    private static EagerSingleton instance=new EagerSingleton();
    //私有构造，拒绝类使用者通过new Object()方法来创建该类实例，破坏单例。
    private EagerSingleton(){}
    //静态全局访问点
    public static EagerSingleton getInstance(){
        return instance;
    }
}

/**
 * @Author trappedBeast
 * @Date 2018/11/14 11:17
 * @Description
 * 单例模式
 * 定义： 确保一个类只有一个实例，并为整个系统提供一个全局访问点 (向整个系统提供这个实例)。
 * 类型： 创建型模式
 * 三要素：
 * 私有的构造方法；
 * 指向自己实例的私有静态引用；
 * 以自己实例为返回值的静态的公有方法。
 */






    