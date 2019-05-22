package com.newStart2019.day0505;

/**
 * @ClassName App
 * @Auther trappedBeast
 * @Date 2019/5/5 21:32
 * @Version 1.0
 * @Description TODO
 **/
public class App {
    int a;
    static int b;
    final int c;

    static {
        b=10;

    }

    {
        c=10;
    }
    public static void main(String[] args) {
        Object b=new Object();
        System.out.println(b.hashCode());
        char a=92;
        char c='\u2122';
        System.out.println(c);
    }
}
    