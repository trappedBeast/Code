package com.CoreTechnology.Chapter05;

/**
 * @ClassName hashcode
 * @Auther trappedBeast
 * @Date 2018/11/19 9:11
 * @Version 1.0
 * @Description TODO
 **/
public class Hashcode {
    public static void main(String[] args) {
        String str1="111";
        String str2 = "111";
        int i = str1.hashCode();
        int j = str2.hashCode();
        System.out.println(i+""+j);

    }
}
    