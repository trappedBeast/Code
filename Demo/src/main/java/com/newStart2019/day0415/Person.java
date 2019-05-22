package com.newStart2019.day0415;

/**
 * @ClassName Person
 * @Auther trappedBeast
 * @Date 2019/4/15 10:34
 * @Version 1.0
 * @Description TODO
 **/
public class Person {
    final String nationality;
    private String name;
    private String gender;

    static {

        System.out.println("Person static code block");
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    {
        nationality="123";
        System.out.println("constructor code block");
    }

    public Person(){

        System.out.println("person no parameter constructor");
    }

    public Person(String name,String gender){
        System.out.println("Person parameter constructor");
        this.name=name;
        this.gender=gender;
    }









}
    