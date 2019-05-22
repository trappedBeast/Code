package com.demo.day1127;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 * @ClassName HashMapDemo
 * @Auther trappedBeast
 * @Date 2018/11/27 0:17
 * @Version 1.0
 * @Description TODO
 **/
//静态导入
import static java.lang.System.out;
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Person,String> map=new HashMap <>();
        map.put(new Person("day0401",18),"aaa");
        map.put(new Person("day0401",18),"aaa");
        map.put(new Person("b",18),"bbb");
        map.put(new Person("c",18),"ccc");
        for (Person person : map.keySet()) {
            out.println(map.get(person));
        }


        map.put(null,null);
        Map map1= new LinkedHashMap();


    }

    //可变参数
    public static Integer getSum(Integer ...a){
        return 1;
    }
}
    