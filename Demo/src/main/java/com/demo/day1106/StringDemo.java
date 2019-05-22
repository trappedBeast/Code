package com.demo.day1106;

/**
 * @ClassName StringDemo
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/6 11:18
 * @Version 1.0
 **/
public class StringDemo {
    public static void main(String[] args) {
        int[] array={1,2,3,4,5};
        String str="[";
        for (int i = 0; i < array.length; i++) {
            if (i<array.length-1){
                str+=array[i]+"#";
            }
            else{
                str+=array[i]+"]";
            }
        }

        System.out.println(str);
    }
}
    