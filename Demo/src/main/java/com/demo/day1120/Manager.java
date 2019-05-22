package com.demo.day1120;

import java.math.BigDecimal;

/**
 * @ClassName Manager
 * @Auther trappedBeast
 * @Date 2018/11/20 11:38
 * @Version 1.0
 * @Description TODO
 **/
public class Manager extends Employee {

    public Manager() {
    }

    public Manager(String name, Integer age, BigDecimal salary, String job) {
        super(name, age, salary, job);
    }

    @Override
    public void working() {
        System.out.println(super.age+"岁的"+super.job+super.name+"在酒店做管理，工资"+super.salary);
    }
}
    