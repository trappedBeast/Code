package com.newStart2019.day0404;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @ClassName ListTraversal
 * @Auther trappedBeast
 * @Date 2019/4/4 15:21
 * @Version 1.0
 * @Description TODO
 **/
public class ListTraversal {
    public static void randomAccessTraversal(List<Integer> list){
        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        for (int i = 0; i < list.size(); i++) {
            list.get(i);
        }
        endTime=System.currentTimeMillis();
        long interval=endTime-startTime;
        System.out.println("randomAccessTraversal:  "+interval);
    }


    public static void iteratorTraversal(List<Integer> list){
        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        Iterator iterator=list.listIterator();
        while (iterator.hasNext()){
            iterator.next();
        }
        endTime=System.currentTimeMillis();
        long interval=endTime-startTime;
        System.out.println("iteratorTraversal:  "+interval);
    }

    public static void forTraversal(List<Integer> list){
        long startTime;
        long endTime;
        startTime=System.currentTimeMillis();
        Iterator iterator=list.listIterator();
        for (int value : list) {
            ;
        }
        endTime=System.currentTimeMillis();
        long interval=endTime-startTime;
        System.out.println("forTraversal:  "+interval);
    }

    public static void test(int num){
        List<Integer> list=new ArrayList <>();
        for (int i = 0; i < num; i++) {
            list.add(i);
        }
        System.out.println("测试数据数量:"+list.size());

        randomAccessTraversal(list);
        iteratorTraversal(list);
        forTraversal(list);
    }

    public static void main(String[] args) {
        test(1000000);

    }
}
    