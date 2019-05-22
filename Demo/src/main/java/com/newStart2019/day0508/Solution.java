package com.newStart2019.day0508;

import java.util.Arrays;

/**
 * @ClassName Solution
 * @Auther trappedBeast
 * @Date 2019/5/9 11:14
 * @Version 1.0
 * @Description 在一个二维数组中（每个一维数组的长度相同），
 * 每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。
 * 请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 **/
public class Solution {
    //利用java自身工具类Arrays.binarySearch()二分法工具类方法查找
    public static boolean binarySearchForJava(int target, int [][] array) {
        for(int[] arr:array){
            int i= Arrays.binarySearch(arr,target);
            if (i>=0)
                return true;
        }
        return false;
    }

    //思路同上，自定义二分法
    public static boolean binarySearchForCustom(int target,int[][] array){
        for(int[] arr:array){
            int low=0;//比较低点索引
            int high=arr.length-1;//高点索引
            while (low<=high){//当出现低点大于高点的时候查找自然结束
                int mid=(low+high)>>>1;//比较值索引
                int midVal=arr[mid];//比较值
                if(target>midVal)//如果目标值大于比较值，说明目标值只可能存在比较值索引(不包含比较值索引)到高点索引之间
                    low=mid+1;
                else if (target<midVal)//同理
                    high=mid-1;
                else//以上都不满足，即查找到目标值
                    return true;
            }
        }
        return false;
    }


    public static boolean find(int target,int[][] array){
        int row=0;
        int col=array[0].length-1;
        while (row<=array.length-1 && col>=0){
            if(target==array[row][col])
                return true;
            else if (target>array[row][col])
                row++;
            else
                col--;
        }
        return false;
    }




    public static void main(String[] args) {
        int[][] array=new int[2][2];
        array[0][0]=0;
        boolean find;
        //boolean find = Solution.binarySearchForJava(0,array);
        //find=Solution.binarySearchForCustom(0,array);
        find=Solution.find(0,array);
        System.out.println(find);
    }

}
    