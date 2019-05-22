package com.demo2019.day0123;

import java.util.Objects;

/**
 * @ClassName Person
 * @Auther trappedBeast
 * @Date 2019/1/22 11:06
 * @Version 1.0
 * @Description TODO
 **/
public class Person {
    /*public static void main(String[] args) {
        if(new Person() instanceof Object){
            System.out.println("change!");
        }
    }*/


    private String name;
    private String gender;
    private Integer age;


    @Override
    public int hashCode() {
        return Objects.hash(name,this.gender,this.age);
    }
}
    