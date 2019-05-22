package com.demo.day1211;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Test
 * @Auther trappedBeast
 * @Date 2018/12/11 15:26
 * @Version 1.0
 * @Description TODO
 **/
public class ReflectDemo {
    public static <name> void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchFieldException {
        Class clazz = Class.forName("com.demo.day1211.Person");
        /**
         * @Author trappedBeast
         * @Date 2018/12/11 18:13
         * @Description 反射访问私有构造
        Constructor constructor = clazz.getDeclaredConstructor(String.class);
        constructor.setAccessible(true);
        Object o = constructor.newInstance("zhengchao");
        System.out.println(o);*/

        /*
        Object obj = clazz.newInstance();
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);
        name.set(obj,"zhengchaoa");
        System.out.println(obj);*/

        List <String> list = new ArrayList <>();
        list.add("day0401");
        Class clazz1 = list.getClass();
        Method add = clazz1.getMethod("add",Object.class);
        add.invoke(list,12313);
        System.out.println(list);

        System.out.println(list.get(1));


    }

}
    