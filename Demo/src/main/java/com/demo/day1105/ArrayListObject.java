package com.demo.day1105;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ArrayListObject
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/5 15:29
 * @Version 1.0
 **/
public class ArrayListObject {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        System.out.println("原始形式："+list);
        String str="{";
        for (int i = 0; i < list.size() ; i++) {
            if (i<list.size()-1){
                str+=list.get(i)+"@";
            }
            else {
                str+=list.get(i)+"}";
            }

        }
        System.out.println(str);
    }
}
    