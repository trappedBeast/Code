package com.sort;

/**
 * @ClassName MatrixSearch
 * @Auther trappedBeast
 * @Date 2019/5/13 11:33
 * @Version 1.0
 * @Description 有序矩阵查找
 **/
public class MatrixSearch {



    /**
     * @Author trappedBeast
     * @Date 2019/5/13 11:49
     * @Description //
     *
     * col
     * 1   2   3   4   5   6  row
     * 7   8   9  10  11  12
     * 9  10  11  12  13  14
     * 10 12  13  15  18  20
     *
     */

    public static boolean search(int target,int[][] array){
        int row=0;//行索引
        int col=array[0].length-1;
        while (row<=array[0].length-1 && col>=0){
            if(target==array[row][col])
                return true;
            else if (target>array[row][col])
                row++;
            else
                col--;
        }
        return false;
    }
}
    