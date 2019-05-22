package com.demo.day1106;

/**
 * @ClassName Person
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/7 11:56
 * @Version 1.0
 **/
public class Person {
    private String name;
    private int age;
    private char gender;

    static {
        System.out.println("person的静态代码块");
    }


    public Person(){
        System.out.println("Person的空构造");
    }
}
    