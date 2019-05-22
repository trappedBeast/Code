package com.demo.day1112;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName Manager
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/12 17:46
 * @Version 1.0
 **/
public class Manager extends User {
    public Manager(){}

    public Manager(String userName, double money) {
        super(userName, money);
    }

    /**
     * @Author trappedBeast
     * @Description //发普通红包,
     * @Date 2018/11/12 18:29
     * @Param [count]
     * @return java.util.List<java.lang.Double>
     **/
    public List<Double> send(double singleMoney,int count){
        List<Double> list=new ArrayList<>();
        double balance=super.getMoney();
        double totalMoney=singleMoney*count;
        if(totalMoney>balance){
            System.out.println("余额不足");
            return list;
        }
        super.setMoney(balance-totalMoney);
        for (int i = 0; i < count; i++) {
            list.add(singleMoney);
        }
        return list;




    }
}
    