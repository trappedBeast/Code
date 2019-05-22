package com.newStart2019.day0413;

/**
 * @ClassName Son
 * @Auther trappedBeast
 * @Date 2019/4/14 1:13
 * @Version 1.0
 * @Description TODO
 **/
public class Son extends  Father{
    private String name="sonName";
    protected String gender="sonGender";
    String age="sonAge";
    public String salary="sonSalary";

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getAge() {
        return age;
    }

    @Override
    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String getSalary() {
        return salary;
    }

    @Override
    public void setSalary(String salary) {
        this.salary = salary;
    }

    private void method01(){
        System.out.println("son method01");
    }
    protected void method02(){
        System.out.println("son method02");
    }

    void method03(){
        System.out.println("son method03");
    }

    public void method04(){
        System.out.println("son method04");
    }











}
    