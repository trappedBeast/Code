package com.newStart2019.day0421;

/**
 * @ClassName Outer
 * @Auther trappedBeast
 * @Date 2019/4/22 11:48
 * @Version 1.0
 * @Description TODO
 **/
public class Outer {
    private int num;
    private class Inner{
        private void method(){
            System.out.println(num);
        }
    }


    public void print(){
        Inner inner=new Inner();
        inner.method();
    }
}
    