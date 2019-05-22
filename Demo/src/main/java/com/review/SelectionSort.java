package com.review;

/**
 * @ClassName SelectionSort
 * @Auther trappedBeast
 * @Date 2019/5/15 11:01
 * @Version 1.0
 * @Description TODO
 **/
public class SelectionSort {
    public static int[] sort(int[] arr){
        for (int i=0;i<arr.length-1;i++){
            for (int j=i+1;j<arr.length;j++){
                if (arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
}
    