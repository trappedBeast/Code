package com.demo.day1120;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName HashMapDemo
 * @Auther trappedBeast
 * @Date 2018/11/20 18:26
 * @Version 1.0
 * @Description TODO
 **/
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hashMap=new HashMap();
        hashMap.put(1,1);
        hashMap.put(2,2);
        hashMap.put(3,3);
        hashMap.put(4,4);
        hashMap.put(5,5);
        hashMap.put(6,6);
        Set<Integer> set=hashMap.keySet();
        System.out.println(set.getClass());
        /*for (Integer integer : set) {

            System.out.println(hashMap.get(integer));
        }*/
        for (Map.Entry<Integer, Integer> entryntry : hashMap.entrySet()) {
            Integer key=entryntry.getKey();
            Integer value=entryntry.getValue();
        }



    }
}
    