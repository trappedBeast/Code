package com.newStart2019.day0513;

/**
 * @ClassName RegexDemo
 * @Auther trappedBeast
 * @Date 2019/5/14 10:16
 * @Version 1.0
 * @Description TODO
 **/
public class RegexDemo {
    public static void main(String[] args) {
        String s="[1-9]\\d{4,14}";
        String x="[abc]";
        System.out.println("a".matches(x));
        System.out.println("ab".matches(x));
        String sy="";
        System.out.println();

    }
}
    