package com.demo.day1120;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ListDemo
 * @Auther trappedBeast
 * @Date 2018/11/20 14:40
 * @Version 1.0
 * @Description TODO
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        //list.add(4,"4");//下标越界
        String a=list.remove(0);
        System.out.println(list.get(0));


    }
}
    