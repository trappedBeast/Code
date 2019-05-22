package com.newStart2019.day0403;

import java.util.HashSet;
import java.util.Set;

/**
 * @ClassName SetDemo
 * @Auther trappedBeast
 * @Date 2019/4/3 14:37
 * @Version 1.0
 * @Description TODO
 **/
public class SetDemo {
    public static void main(String[] args) {
        Set set=new HashSet();
        set.add("1");
        set.add("2");
        set.add("1");
        System.out.println(set);
    }
}
    