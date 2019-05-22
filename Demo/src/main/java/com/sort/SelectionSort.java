package com.sort;

import java.util.Arrays;

/**
 * @ClassName SelectionSort
 * @Auther trappedBeast
 * @Date 2019/5/13 17:37
 * @Version 1.0
 * @Description TODO
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr={23,12,61,1,21,9,0};
        System.out.println(Arrays.toString(sort(arr)));
    }


    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
    