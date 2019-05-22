package com.demo.day1120;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @ClassName MainApp
 * @Auther trappedBeast
 * @Date 2018/11/20 11:44
 * @Version 1.0
 * @Description TODO
 **/
public class MainApp {
    public static void main(String[] args) {
        /*ArrayList<Manager> manager=new ArrayList<>();
        ArrayList<Security> securities=new ArrayList<>();
        manager.add(new Manager("张然",24,BigDecimal.valueOf(12000),"大堂经理"));
        manager.add(new Manager("王若",24,BigDecimal.valueOf(12000),"大堂经理"));
        securities.add(new Security("李安",24,BigDecimal.valueOf(8000),"保安"));
        securities.add(new Security("赵倩",18,BigDecimal.valueOf(8000),"保安"));
        showWork(manager);
        showWork(securities);*/
        /*double day0401=0.11;
        double b=0.99;
        double c=day0401+b;*/
        System.out.println(0.05 + 0.01);


    }

    public static void showWork(ArrayList <? extends Employee> list) {
        Iterator <? extends Employee> it = list.iterator();
        while (it.hasNext()) {
            Employee employee = it.next();
            employee.working();
        }


    }
}
    