package com.demo.day1106;

/**
 * @ClassName Student
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/6 11:34
 * @Version 1.0
 **/
public class Student {
    private String name;
    private int age;
    static String room;
    private int id;
    private static int idNum;
    public Student(){
        this.id=++idNum;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        this.id=++idNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getRoom() {
        return room;
    }

    public static void setRoom(String room) {
        Student.room = room;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
    