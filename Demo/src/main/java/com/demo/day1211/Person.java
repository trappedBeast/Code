package com.demo.day1211;

/**
 * @ClassName Person
 * @Auther trappedBeast
 * @Date 2018/12/11 16:02
 * @Version 1.0
 * @Description TODO
 **/
public class Person {
    private String name;
    private String age;

    public Person(String name,String age) {
        this.name = name;
        this.age = age;
    }

    private Person(String name){
        this.name=name;
    }

    public Person(){};

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }


    public void eat(String food){
        System.out.println("人吃"+food);
    }
}
    