package com.CoreTechnology.Chapter06;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName Demo01
 * @Auther trappedBeast
 * @Date 2018/11/28 16:11
 * @Version 1.0
 * @Description TODO
 **/
public class Demo01 {
    public static void main(String[] args) {
        Employee [] employees={new Employee(20D,"zc"),new Employee(50D,"zc"),new Employee(100D,"zc")};
        Arrays.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
        List<Employee> list=new ArrayList <>();
        list.add(new Employee(20D,"zc"));
        list.add(new Employee(50D,"zc"));
        list.add(new Employee(100D,"zc"));
        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,new DesComparator<>());
        System.out.println(list);

    }
}
    