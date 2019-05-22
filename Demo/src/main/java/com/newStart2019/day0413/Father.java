package com.newStart2019.day0413;

/**
 * @ClassName Father
 * @Auther trappedBeast
 * @Date 2019/4/13 16:10
 * @Version 1.0
 * @Description TODO
 **/
public class Father {
    private String name="fatherName";
    //protected String gender="fatherGender";
    String age="fatherAge";
    public String salary="fatherSalary";


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

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private void method01(){
        System.out.println("father method01");
    }

    /*protected void method02(){
        System.out.println("father method02");
    }*/

    void method03(){
        System.out.println("father method03");
    }

    public void method04(){
        System.out.println("father method04");
    }










}
    