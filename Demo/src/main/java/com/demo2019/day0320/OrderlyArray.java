package com.demo2019.day0320;

/**
 * @ClassName OrderlyArray
 * @Auther trappedBeast
 * @Date 2019/3/20 10:00
 * @Version 1.0
 * @Description 自定义有序数组
 * 沿用java Array的特性：1.必须指定数组的长度,长度一但指定不能更改
 **/
public class OrderlyArray<E> {
    private static int length;
    Object[] elementData;

    //Param Constructor
    public OrderlyArray(int length){
        elementData=new Object[length];
    }

    //insert data
    public boolean insert(E e){

        elementData[length++]=e;
        return true;
    }

    //







}
    