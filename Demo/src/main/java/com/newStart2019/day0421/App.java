package com.newStart2019.day0421;

import java.util.HashMap;

/**
 * @ClassName App
 * @Auther trappedBeast
 * @Date 2019/4/22 11:59
 * @Version 1.0
 * @Description TODO
 **/
public class App {
    public static void main(String[] args) {
        HashMap <Object, Object> map = new HashMap <>();
        map.put(1,1);
        map.put(1,1);
        map.put(1,1);map.put(1,1);map.put(1,1);
        System.out.println(map);

        Outer01.Inner oi=new Outer01.Inner();
        oi.method();




    }
}
    