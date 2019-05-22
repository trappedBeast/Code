package com.review;

/**
 * @ClassName BubbleSort01
 * @Auther trappedBeast
 * @Date 2019/5/15 10:11
 * @Version 1.0
 * @Description TODO
 **/
public class BubbleSort01 {
    public static  int[] sort01(int[] arr){
        for (int i = 0; i <arr.length-1 ; i++) {
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }



    public static int[] sort02(int[] arr){
        int i=arr.length-1;
        while (i>0){
            int flag=0;
            for (int j=0;j<i;i++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[i];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=j;
                }
            }
            i=flag;
        }
        return arr;
    }


    public static int[] sort03(int[] arr){
        int low=0;
        int high=arr.length-1;
        while (low<high){
            int f1=0,f2=0;
            for (int i = low; i <high ; i++) {
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                    f1=i;
                }
            }
            high=f1;
            for(int j=high;j>low;j--){
                if(arr[j]<arr[j-1]){
                    int temp=arr[j];
                    arr[j]=arr[j-1];
                    arr[j-1]=temp;
                    f2=j;
                }
            }
            low=f2;

        }
        return arr;
    }
}
    