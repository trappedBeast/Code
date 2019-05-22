package com.demo2019.day0331;

/**
 * @ClassName Son
 * @Auther trappedBeast
 * @Date 2019/4/1 0:06
 * @Version 1.0
 * @Description TODO
 **/
public class Son extends Father {
    int num2=20;
    public Son(){
        System.out.println("son的无参构造");
    }

    public void print(){
        System.out.println(num1);
        System.out.println(num2);
    }

    public static void main(String[] args) {
        Son son=new Son();
        son.print();
    }
}
    