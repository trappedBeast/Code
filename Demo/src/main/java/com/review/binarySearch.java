package com.review;

import java.util.Arrays;

/**
 * @ClassName binarySearch
 * @Auther trappedBeast
 * @Date 2019/5/13 15:06
 * @Version 1.0
 * @Description 二分法查找
 **/
public class binarySearch {

    public static void main(String[] args) {
        int i = binarySearchForCustom(1,new int[]{1,23,4133,112,45});
        System.out.println(i);
    }


    public static int binarySearchForJava(int target,int[] arr){
        return Arrays.binarySearch(arr,target);
    }

    public static int binarySearchForCustom(int target,int[] arr){
        //设置比较的低点索引和高点索引
        int low=0;
        int high=arr.length-1;
        while (low<=high){
            int mid=(low+high)>>>1;
            int midVal=arr[mid];
            if(target==midVal)
                return mid;
            else if (target>midVal)
                low=mid+1;
            else
                high=mid-1;
        }
        return -(low+1);
    }


}
    