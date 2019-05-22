package com.CoreTechnology.Chapter06;

import java.util.Date;

/**
 * @ClassName Demo
 * @Auther trappedBeast
 * @Date 2018/11/22 16:49
 * @Version 1.0
 * @Description TODO
 **/
public class Demo {
    public static void main(String[] args) {
        /*Person[] peoples = new Person[]{new Person(120D), new Person(13D), new Person(80D)};
        System.out.println("===================排序前");
        for (Person person : peoples) {
            System.out.println(person);
        }
        System.out.println("===================排序后");
        //利用Arrays工具类对自定义类对象数组person进行排序,需要对自定义对象实现Comparable接口的compareTo()
        Arrays.sort(peoples);
        for (Person person : peoples) {
            System.out.println(person);
        }
        System.out.println("===================判断person对象是否属于Comparable的实例");
        Person person=new Person(800D);
        System.out.println(new Person() instanceof Comparable);



        Person person1=new Person();
        person1.setSalary(500000D);

        Person person3=person1;
        person3.setSalary(1000000D);
        System.out.println(person1);
        System.out.println(person3);
        System.out.println(person1==person3);
        System.out.println("==============================");
        Person person2= (Person) person1.clone();
        person2.setSalary(800000D);
        System.out.println(person1);
        System.out.println(person2);
        System.out.println(person1==person2);


        System.out.println("===============================");*/
        Address address=new Address("上海");
        Person person4=new Person(500000D,address);
        Person person5= (Person) person4.clone();
        System.out.println(person4+""+person4.getAddress());
        System.out.println(person5+""+person5.getAddress());
        address.setAdd("襄阳");
        System.out.println(person4+""+person4.getAddress());
        System.out.println(person5+""+person5.getAddress());

        Date date=new Date();
        //LocalDate
        //Object




    }
}
    