package com.newStart2019.day0519;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * @ClassName LinkedListDemo
 * @Auther trappedBeast
 * @Date 2019/5/19 20:54
 * @Version 1.0
 * @Description TODO
 **/
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList();
        ArrayList arrayList=new ArrayList();
        arrayList.add("2");
        arrayList.add("1");
        linkedList.add("2");
        linkedList.add("1");
        System.out.println(linkedList.toString());
        System.out.println(arrayList.toString());
        System.out.println(linkedList.get(0));
        System.out.println(linkedList.size());

    }
}
    