package com.designPatterns.singleton;

/**
 * @ClassName Singleton
 * @Auther trappedBeast
 * @Date 2018/11/14 16:45
 * @Version 1.0
 * @Description TODO
 **/
public class Singleton {
    private volatile static Singleton instance=null;

    private Singleton() {
    }

    public static Singleton getInstance(){
        if(null==instance){
            synchronized (Singleton.class){
                if(null==instance){
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }

}
    