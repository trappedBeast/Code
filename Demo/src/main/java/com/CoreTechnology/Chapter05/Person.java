package com.CoreTechnology.Chapter05;

/**
 * @ClassName Person
 * @Auther trappedBeast
 * @Date 2018/11/16 10:08
 * @Version 1.0
 * @Description TODO
 **/
public class Person {
    private String name;
    private Integer age;

    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        this.name="";
        this.age=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }


    public void method(){
        System.out.println("方法");
    }
}
    