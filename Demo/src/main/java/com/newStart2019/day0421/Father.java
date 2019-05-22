package com.newStart2019.day0421;

/**
 * @ClassName Father
 * @Auther trappedBeast
 * @Date 2019/4/22 11:00
 * @Version 1.0
 * @Description TODO
 **/
public final class Father extends Son{
    private String name;
    private String age;
    private String gender;


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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Father() {
        System.out.println("father empty parameter construction");
    }

    public Father(String name,String age,String gender) {
        System.out.println("father parameter construction");
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void method1(){
        System.out.println("father method1");
    }
}
    