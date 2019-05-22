package com.designPatterns.singleton;

/**
 * @ClassName MainApp
 * @Auther trappedBeast
 * @Date 2018/11/14 14:07
 * @Version 1.0
 * @Description TODO
 **/
public class MainApp {
    public static void main(String[] args) {
        EagerSingleton eagerSingleton=EagerSingleton.getInstance();
        EagerSingleton eagerSingleton1=EagerSingleton.getInstance();
        if(eagerSingleton==eagerSingleton1){
            System.out.println("ok");
        }
    }
}
    