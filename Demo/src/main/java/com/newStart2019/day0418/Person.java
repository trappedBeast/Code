package com.newStart2019.day0418;

/**
 * @ClassName Person
 * @Auther trappedBeast
 * @Date 2019/4/18 17:56
 * @Version 1.0
 * @Description TODO
 **/
public class Person {
    private String name;
    private String sex;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name,String sex,int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Person() {

    }
}
    