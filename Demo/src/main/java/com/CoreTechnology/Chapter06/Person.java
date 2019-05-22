package com.CoreTechnology.Chapter06;

import java.util.logging.Logger;

/**
 * @ClassName Pserson
 * @Auther trappedBeast
 * @Date 2018/11/22 16:50
 * @Version 1.0
 * @Description TODO
 **/
public class Person implements Comparable <Person>, Cloneable {
    private static Logger logger = Logger.getLogger("Person");
    private Double salary;

    private Address address;


    public Person(Double salary) {
        this.salary = salary;
    }

    public Person(Double salary,Address address) {
        this.salary = salary;
        this.address = address;
    }

    public Person() {
        this.salary = 0D;
        this.address = null;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                '}';
    }

    @Override
    public int compareTo(Person person) {
        return Double.compare(this.salary,person.getSalary());
    }

    @Override
    public Object clone() {
        Person person = null;
        try {
            logger.info("clone()");
            person = (Person) super.clone();//浅复制
            if(this.address!=null){
                person.address = (Address) address.clone();//深复制
            }
        } catch (CloneNotSupportedException e) {
            logger.info("clone异常:" + e);
        }

        return person;
    }


}
    