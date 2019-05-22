package com.demo.day1106;

/**
 * @ClassName StaticField
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/6 11:33
 * @Version 1.0
 **/
public class StaticField {
    public static void main(String[] args) {
        Student student1=new Student("张三丰",200);
        Student student2=new Student("韦小宝",99);
        Student.setRoom("中原武林");
        student1.setRoom("2131");
        System.out.println(student1.getRoom()+student1.getId());
        System.out.println(student2.getRoom()+student2.getId());




    }

}
    