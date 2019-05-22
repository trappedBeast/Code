package com.demo.day1108;

/**
 * @ClassName Person
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/8 18:08
 * @Version 1.0
 **/
public class Person {
    private String name;
    private String gender;
    private static String address;

    public Person(String name, String gender) {
        this.name = name;
        this.gender = gender;

    }

    public Person() {
    }


     Object say(){
        System.out.println(this.name+gender+address);
        return null;
    }


    public static void  say2(){
        System.out.println(address);
    }

}
    