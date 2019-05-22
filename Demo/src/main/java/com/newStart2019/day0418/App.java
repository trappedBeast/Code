package com.newStart2019.day0418;

/**
 * @ClassName App
 * @Auther trappedBeast
 * @Date 2019/4/18 18:31
 * @Version 1.0
 * @Description TODO
 **/
public class App {
    public static void main(String[] args) {
        Person person=new Person("zc","男",18);
        Person person1=person;
        System.out.println(person.getSex()+","+person.getName()+","+person.getAge());
        System.out.println(person1.getSex()+","+person1.getName()+","+person1.getAge());
        person1.setAge(17);
        person1.setName("zzm");
        person1.setSex("man");
        System.out.println(person.getSex()+","+person.getName()+","+person.getAge());
        System.out.println(person1.getSex()+","+person1.getName()+","+person1.getAge());
    }
}
    