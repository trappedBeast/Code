package com.CoreTechnology.Chapter05;

/**
 * @ClassName Employee
 * @Auther trappedBeast
 * @Date 2018/11/16 15:09
 * @Version 1.0
 * @Description TODO
 **/
public class Employee {
    private String name;
    private Double salary;
    private String hrieDay;

    public Employee() {
        this.name="";
        this.salary=0.00;
        this.hrieDay="";
    }

    public Employee(String name, Double salary, String hrieDay) {
        this.name = name;
        this.salary = salary;
        this.hrieDay = hrieDay;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getHrieDay() {
        return hrieDay;
    }

    public void setHrieDay(String hrieDay) {
        this.hrieDay = hrieDay;
    }


    public Double sumSalary(){
        return this.salary;
    }
}
    