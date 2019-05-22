package com.CoreTechnology.Chapter05;

/**
 * @ClassName Manager
 * @Auther trappedBeast
 * @Date 2018/11/16 15:13
 * @Version 1.0
 * @Description TODO
 **/
public class Manager extends Employee {
    private Double bonus;
    @Override
    public Double sumSalary(){
            return super.getSalary()+bonus;
    }

}
    