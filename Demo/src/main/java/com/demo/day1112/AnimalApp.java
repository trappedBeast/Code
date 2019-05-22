package com.demo.day1112;

/**
 * @ClassName AnimalApp
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/12 17:28
 * @Version 1.0
 **/
public class AnimalApp {
    public static void main(String[] args) {
        Cat catOne=new CatOne();
        catOne.eat();
        catOne.sleep();
        ((CatOne)catOne).active();
        System.out.println("=====================");
        Cat catTwo=new Cattwo();
        catTwo.eat();
        catTwo.sleep();
    }
}
    