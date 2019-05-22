package com.demo.day1127;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName CollectionsDemo
 * @Auther trappedBeast
 * @Date 2018/11/27 22:37
 * @Version 1.0
 * @Description TODO
 **/
public class CollectionsDemo {
    public static void main(String[] args) {
        List<String> list=new ArrayList <>();
        list.add("c");
        list.add("day0401");
        list.add("f");
        list.add("z");
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
}
    