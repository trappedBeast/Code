package com.demo.day1105;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @ClassName ArrayListRandom
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/5 15:23
 * @Version 1.0
 **/
public class ArrayListRandom {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        Random random=new Random();

        for (int i = 0; i < 6; i++) {
            int a=random.nextInt(33)+1;
            list.add(a);
        }

        System.out.println(list);
    }
}
    