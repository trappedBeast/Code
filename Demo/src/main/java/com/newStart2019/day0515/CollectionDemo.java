package com.newStart2019.day0515;

import java.util.*;

/**
 * @ClassName Collection
 * @Auther trappedBeast
 * @Date 2019/5/15 14:45
 * @Version 1.0
 * @Description TODO
 **/
public class CollectionDemo {
    public static void main(String[] args) {
        Collection c;
        List list;
        AbstractList abstractList;
        ArrayList arrayList;

        Vector vector=new Vector(10,4);
        vector.add(0,1);

        Iterator iterator=vector.listIterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
    