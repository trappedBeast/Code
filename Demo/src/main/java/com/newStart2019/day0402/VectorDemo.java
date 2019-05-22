package com.newStart2019.day0402;

import java.util.Iterator;
import java.util.Vector;
import java.util.function.Predicate;

/**
 * @ClassName VectorDemo
 * @Auther trappedBeast
 * @Date 2019/4/2 10:19
 * @Version 1.0
 * @Description TODO
 **/
public class VectorDemo {
    public static void main(String[] args) {
        Vector v=new Vector();
        v.add(1);
        v.add(2);
        v.add(3);
        v.add(4);
        v.add(5);
        v.add(6);
        Predicate<String> predicate = (s) -> s.equals("a");
        v.removeIf(predicate);
        Iterator iterator=v.iterator();
        while (iterator.hasNext()){
            int a = (int) iterator.next();
            if(a>4)
                iterator.remove();

        }

        System.out.println(v);



    }
}
    