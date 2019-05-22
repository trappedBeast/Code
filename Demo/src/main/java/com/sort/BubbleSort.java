package com.sort;

import java.util.Arrays;

/**
 * @ClassName BubbleSort
 * @Auther trappedBeast
 * @Date 2019/5/12 22:41
 * @Version 1.0
 * @Description 冒泡排序
 *
 * int [] arr
 * {10,11,45,23,1,9}
 *
 * 第一轮 ：arr[0]->arr[1], arr[1]->arr[2], arr[2]->arr[3],arr[3]->arr[4],arr[4]->arr[5]
 * 第二轮 ：arr[0]->arr[1], arr[1]->arr[2], arr[2]->arr[3],arr[3]->arr[4]
 * 第三轮： arr[0]->arr[1], arr[1]->arr[2], arr[2]->arr[3]
 * 第四轮： arr[0]->arr[1], arr[1]->arr[2]
 * 第五轮： arr[0]->arr[1]
 *
 *
 **/


public class BubbleSort {

    public static void main(String[] args) {
        int[] arr={11,2,34,14,5,6,7};
        System.out.println(Arrays.toString(sort1(arr)));
        System.out.println(Arrays.toString(sort2(arr)));
        System.out.println(Arrays.toString(sort3(arr)));

    }


   /**
    * @Author trappedBeast
    * @Description //常规冒泡排序
    * @Date 2019/5/13 10:13
    * @Param [array]
    * @return int[]
    */

    public static int[] sort1(int[] array){
        for (int i = 0; i <array.length-1 ; i++) {
            for (int j=0;j<array.length-1-i;j++){
                if (array[j] > array[j+1]){
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
        }
        return array;
    }


    /**
     * @Author trappedBeast
     * @Description //进阶版冒泡排序
     * 与常规冒泡排序的固定比较次数相比，减少比较次数
     * 实现思想：每一轮比较记录最后交换的位置，该位置后就无需再比较了。设置一个递增数组断点调试效果显而易见
     * @Date 2019/5/13 10:36
     * @Param [array]
     * @return int[]
     */
    public static int[] sort2(int[] array){
        int i=array.length-1;
        while (i>0){
            int flag=0;
            for (int j=0;j<i;j++){
                if (array[j] > array[j+1]){
                    flag=j;
                    int temp=array[j];
                    array[j]=array[j+1];
                    array[j+1]=temp;
                }
            }
            i=flag;
        }
        return array;

    }

    /**
     * @Author trappedBeast
     * @Description //上一版本的升级，减少交换次数
     * 实现思想：每一轮比较记录最后交换的位置，该位置后就无需再比较了，该算法只是将此思想在前后都使用了。
     * @Date 2019/5/13 15:00
     * @Param [array]
     * @return int[]
     */
    public static int[] sort3(int[] array){
        int low=0;
        int high=array.length-1;
        while (low<high){
            int f1=0,f2=0;
            for (int i=low;i<high;i++){
                if (array[i] > array[i+1]) {
                    int temp=array[i];
                    array[i]=array[i+1];
                    array[i+1]=temp;
                    f1=i;
                }
            }
            high=f1;
            for(int j=high;j>low;j--){
                if (array[j] < array[j-1]) {
                    int temp=array[j];
                    array[j]=array[j-1];
                    array[j-1]=temp;
                    f2=j;
                }
            }
            low=f2;
        }
        return array;
    }

}
    