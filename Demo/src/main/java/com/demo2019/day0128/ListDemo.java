package com.demo2019.day0128;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName ListDemo
 * @Auther trappedBeast
 * @Date 2019/2/20 17:32
 * @Version 1.0
 * @Description TODO
 **/
public class ListDemo {

    public static void main(String[] args) {
        List<Map<String,String>> list=new ListDemo().method01("01");
        System.out.println(list);
    }

    public List<Map<String,String>> method01(String args){
        return new ArrayList <Map<String,String>>();
    }
}
    