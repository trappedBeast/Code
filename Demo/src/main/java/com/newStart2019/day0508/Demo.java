package com.newStart2019.day0508;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/**
 * @ClassName Demo
 * @Auther trappedBeast
 * @Date 2019/5/8 15:52
 * @Version 1.0
 * @Description TODO
 **/
public class Demo {
    public static void main(String[] args) {
        int [] a={1,2,3,45,6};
        int [] b= Arrays.copyOf(a,a.length*2);
        System.out.println(b.length);
        System.out.println(Arrays.binarySearch(a,1));

        int [] [] c=new int[10][3];
        c[0][0]=1;
        c[0][1]=2;

        System.out.println(Arrays.deepToString(c));
        String str="111";
        byte[] bytes = str.getBytes();
        System.out.println(Arrays.toString(bytes));

        byte[] src,dst;
        src= new byte[]{1,2,3};
        try {
            dst=new String(src,"GBK").getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }
}
    