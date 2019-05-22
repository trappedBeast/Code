package com.demo.day1106;

import java.util.Arrays;
import java.util.Random;

/**
 * @ClassName ArraysDemo
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/7 16:51
 * @Version 1.0
 **/
public class ArraysDemo {
    public static void main(String[] args) {
       // int [] array={1,2,3,4,5,6,7};
        System.out.println(Arrays.toString(new int[] {3,1,4}));
        Random random=new Random();
        int [] arrray=new int[10];
        for (int i = 0; i < arrray.length; i++) {

            System.out.println(random.nextInt(100));
            arrray[i]=random.nextInt(100);
            
        }
        Arrays.sort(arrray);
        System.out.println(Arrays.toString(arrray));

        for (int i = arrray.length - 1; i >= 0; i--) {
            System.out.println(arrray[i]);
        }





    }
}
    