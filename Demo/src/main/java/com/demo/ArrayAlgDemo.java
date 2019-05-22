package com.demo;

import com.CoreTechnology.Chapter06.ArrayAlg;

/**
 * @ClassName ArrayAlgDemo
 * @Auther trappedBeast
 * @Date 2018/11/29 18:11
 * @Version 1.0
 * @Description TODO
 **/
public class ArrayAlgDemo {
    public static void main(String[] args) {
        double[] array = new double[]{1,2,3,4,56,2,13,678};
        ArrayAlg.Pari pari = ArrayAlg.minMax(array);
        System.out.println("min:" + pari.getMin() + "..." + "max" + pari.getMax());
    }
}
    