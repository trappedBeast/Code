package com.sort;

import java.util.Arrays;

/**
 * @ClassName BinarySerch
 * @Auther trappedBeast
 * @Date 2019/5/13 10:59
 * @Version 1.0
 * @Description TODO
 **/
public class binarySearch{
    /**
     * @Author trappedBeast
     * @Description //利用Java工具类Arrays的二分方法实现
     * @Date 2019/5/13 11:18
     * @Param [target, array]
     * @return boolean
     */
    public static boolean binarySearchForJava(int target, int [][] array) {
        for(int[] arr:array){
            int i= Arrays.binarySearch(arr,target);
            if (i>=0)
                return true;
        }
        return false;
    }

    /**
     * @Author trappedBeast
     * @Description //自定义二分法查找
     * @Date 2019/5/13 11:23
     * @Param [target, array]
     * @return boolean
     */
    public static boolean binarySearchForCustom(int target, int [][] array){
        for (int[] arr:array){
            int low=0;
            int high=arr.length-1;
            while (low<=high){
                int mid=(low+high)>>>1;
                int midVal=arr[mid];
                if (target==midVal)
                    return true;
                else if(target>midVal)
                    low=mid+1;
                else
                    high=mid-1;
            }
        }
        return false;
    }



}
    