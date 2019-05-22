package com.review;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Auther trappedBeast
 * @Date 2019/5/13 15:21
 * @Version 1.0
 * @Description TODO
 **/
public class BubbleSort {
    public static void main(String[] args) {
        int[] arr={11,2,34,14,5,6,7};
        //System.out.println(Arrays.toString(sort1(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
        System.out.println(Arrays.toString(sort3(arr)));

    }


    public static int[] sort1(int[] arr){
        //常规冒泡排序
        for (int i = 0; i <arr.length-1 ; i++) {
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }


    public static int[] sort2(int[] arr){
        int i=arr.length-1;
        while (i>0){
            int flag=0;
            for (int j=0;j<i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=j;
                }
            }
            i=flag;
        }
        return arr;
    }

    public static int[] sort3(int[] arr){
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int f1=0,f2=0;
            for (int i = 0; i <high ; i++) {
                if (arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    f1=i;
                }
            }
            high=f1;
            for(int j=high;j>low;j--){
                if (arr[j]<arr[j-1]){
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    f2=j;
                }
            }
            low=f2;
        }
        return arr;
    }
}
    