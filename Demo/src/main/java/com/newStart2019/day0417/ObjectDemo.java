package com.newStart2019.day0417;

import java.util.Objects;

/**
 * @ClassName ObjectDemo
 * @Auther trappedBeast
 * @Date 2019/4/17 11:02
 * @Version 1.0
 * @Description TODO
 **/
public class ObjectDemo {

    @Override
    public int hashCode(){
        return Objects.hash();
    }
    public static void main(String[] args) {
        Object object1=new ObjectDemo();
        Object object2=object1;
        Object object3=new ObjectDemo();
        System.out.println(object1.equals(object2));
        System.out.println(object1.equals(object3));



    }
}
    