package com.demo2019.day0111;

/**
 * @ClassName ArrayDemo
 * @Auther trappedBeast
 * @Date 2019/1/11 17:38
 * @Version 1.0
 * @Description TODO
 **/
public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int temp=0;
        for (int i = 0; i < arr.length/2; i++) {

            temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }


        for (int i : arr) {
            System.out.println(i);
        }

    }
}
    