package com.demo.day1120;

import java.math.BigDecimal;
import java.util.Objects;

/**
 * @ClassName Employee
 * @Auther trappedBeast
 * @Date 2018/11/20 11:24
 * @Version 1.0
 * @Description TODO
 **/
public abstract class Employee {
    String name;
    Integer age;
    BigDecimal salary;
    String job;

    public Employee() {
        this.name="";
        this.age=0;
        this.salary=BigDecimal.valueOf(0.0);
    }

    public Employee(String name, Integer age, BigDecimal salary, String job) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.job = job;
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

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public abstract void working();


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name) &&
                Objects.equals(age, employee.age) &&
                Objects.equals(salary, employee.salary) &&
                Objects.equals(job, employee.job);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, salary, job);
    }
}
    