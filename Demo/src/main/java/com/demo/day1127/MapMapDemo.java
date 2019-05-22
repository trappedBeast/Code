package com.demo.day1127;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MapMapDemo
 * @Auther trappedBeast
 * @Date 2018/11/27 23:49
 * @Version 1.0
 * @Description TODO
 **/
public class MapMapDemo {
    public static void main(String[] args) {
        Map<String,String> map1=new HashMap <>();
        Map<String,String> map2=new HashMap <>();
        map1.put("001","1");
        map1.put("002","2");
        map2.put("003","3");
        map2.put("004","4");
        Map<String,Map<String,String>> map=new HashMap <>();
        map.put("1",map1);
        map.put("2",map2);
    }
}
    