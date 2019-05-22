package com.demo2019.day0321;

/**
 * @ClassName StaticTest
 * @Auther trappedBeast
 * @Date 2019/3/21 9:43
 * @Version 1.0
 * @Description TODO
 **/
public class StaticTest {
    static int x=10;

    static{
        x/=3;
    }
    static {
        x+=5;
    }


    public static void main(String[] args) {
        System.out.println("x="+x);

    }

}
    