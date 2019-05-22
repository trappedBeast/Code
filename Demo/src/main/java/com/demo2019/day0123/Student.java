package com.demo2019.day0123;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Objects;

/**
 * @ClassName Student
 * @Auther trappedBeast
 * @Date 2019/1/22 11:09
 * @Version 1.0
 * @Description TODO
 **/
public class Student extends Person {
    public static void main(String[] args) throws IOException {
        if(new Person() instanceof Person){
            System.out.println("change!");

            boolean equals = Objects.equals(null,null);
            System.out.println(equals);


            new FileInputStream("").available();
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }
}
    