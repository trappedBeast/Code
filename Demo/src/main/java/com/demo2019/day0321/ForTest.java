package com.demo2019.day0321;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ForTest
 * @Auther trappedBeast
 * @Date 2019/3/26 10:44
 * @Version 1.0
 * @Description TODO
 **/
public class ForTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList <>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");
        list.add("6");
        for (String s : list) {
            if(s.equals("1")){
                System.out.println(s);
                continue;
            }
            if(s.equals("2")){
                System.out.println(s);
                continue;
            }
        }

    }
}
    