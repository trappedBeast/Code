package com.CoreTechnology.Chapter06;

import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName ProxyDemo
 * @Auther trappedBeast
 * @Date 2018/11/29 18:32
 * @Version 1.0
 * @Description TODO
 **/
public class ProxyDemo {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList <>();
        MyinvocationHandler invocation = new MyinvocationHandler(list);
        Object proxy = Proxy.newProxyInstance(null,new Class[]{List.class},invocation);
        if (proxy instanceof List) {
            System.out.println("proxy is list");
            List <String> mlist = (List <String>) proxy;
            mlist.add("apple");
            mlist.add("apple");
            mlist.add("one");
            mlist.add("two");
        }
        System.out.println("proxy:" + proxy.toString());
        System.out.println("list:" + list.toString());


    }
}
    