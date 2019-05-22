package com.CoreTechnology.Chapter06;

/**
 * @ClassName Student
 * @Auther trappedBeast
 * @Date 2018/11/28 15:44
 * @Version 1.0
 * @Description TODO
 **/
public class Employee implements Comparable <Employee> {
    Double salary;
    String name;

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employee(Double salary,String name) {
        this.salary = salary;
        this.name = name;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Employee employee) {
        //顺序
        // return Double.compare(this.salary,employee.getSalary());
        //逆序
        if (this.salary > employee.getSalary())
            return -1;

        if (this.salary < employee.getSalary())
            return -1;
        long thisBit = Double.doubleToLongBits(this.salary);
        long otherBit = Double.doubleToLongBits(employee.getSalary());
        return (thisBit == otherBit ? 0 : (thisBit > otherBit ? 1 : -1));
    }
}
    