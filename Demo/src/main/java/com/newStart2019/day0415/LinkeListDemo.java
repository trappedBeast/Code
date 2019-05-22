package com.newStart2019.day0415;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * @ClassName LinkeListDemo
 * @Auther trappedBeast
 * @Date 2019/4/15 16:57
 * @Version 1.0
 * @Description TODO
 **/
public class LinkeListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        int i = list.indexOf("0");
        System.out.println(i);

        System.out.println(list.get(0));

        /*Iterator iterator=list.iterator();
        while (iterator.hasNext()){
            String str=(String) iterator.next();
            System.out.println(str);
            if(Integer.parseInt(str)>5){
                iterator.remove();
            }
        }
        System.out.println(list);*/
        ListIterator iterator=list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.nextIndex();
        }







        System.out.println(list);





    }
}
    