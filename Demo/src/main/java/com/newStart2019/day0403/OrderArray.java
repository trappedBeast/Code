package com.newStart2019.day0403;

/**
 * @ClassName OrderArray
 * @Auther trappedBeast
 * @Date 2019/4/3 15:49
 * @Version 1.0
 * @Description 自定义有序数组
 **/
public class OrderArray<T extends Integer> {
    private T[] elementData;
    public int length=0;
    public OrderArray(){
        elementData= (T[]) new Object[50];
    }
    public void add(T value){
        elementData[length]=value;

    }


    public static void main(String[] args) {
        Demo d=new Demo();
        d.say();
    }



}
    