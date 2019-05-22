package com.demo.day1120;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @ClassName CollectionDemo
 * @Auther trappedBeast
 * @Date 2018/11/20 10:25
 * @Version 1.0
 * @Description TODO
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        Collection<String> coll=new ArrayList<String>();
        coll.add("1");
        coll.add("1");
        System.out.println(coll.size());
        coll.clear();
        System.out.println(coll.size());
        ((ArrayList<String>) coll).add(0,"4");
        System.out.println(coll.contains("4"));


    }
}
    