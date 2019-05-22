package com.designPatterns.singleton;

/**
 * @ClassName LazySingleton
 * @Auther trappedBeast
 * @Date 2018/11/14 11:23
 * @Version 1.0
 * @Description ：
 * 懒汉式是典型的时间换空间,就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。
 * 当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间
 * 由于懒汉式的实现是线程安全的，这样会降低整个访问的速度，而且每次都要判断。
 **/
public class LazySingleton {
    private static LazySingleton instance=null;
    private LazySingleton(){}
    public static synchronized LazySingleton getInstance(){
        if(null==instance){
            instance=new LazySingleton();
        }
        return  instance;
    }
}
    