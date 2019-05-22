package com.newStart2019.day0403;

import java.util.*;

/**
 * @ClassName List
 * @Auther trappedBeast
 * @Date 2019/4/3 14:53
 * @Version 1.0
 * @Description TODO
 **/
public class ListDemo {
    public static void main(String[] args) {
        List<String> list=new LinkedList <>();
        list.add("a");
        list.add("b");
        ListIterator iterator=list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
            iterator.set("c");
            System.out.println(iterator.next());
        }
        System.out.println(list);

        //List list1=new ArrayList(-1);


        List list1=new ArrayList(0);
        System.out.println(list1.size());
        Object[] elementData;


        //elementData = Arrays.copyOf(elementData, size, Object[].class);


        ArrayListProy<String> listProy=new ArrayListProy <>(list);
        System.out.println(listProy.size());
        Object[] a= list.toArray();
        Integer[] b= (Integer[]) a;





     }
}
    