package com.CoreTechnology.Chapter05;

import java.util.ArrayList;
import java.util.Random;

/**
 * @ClassName RandomMode
 * @Auther trappedBeast
 * @Date 2018/11/19 15:19
 * @Version 1.0
 * @Description TODO
 **/
public class RandomMode implements OpenMode {
    @Override
    public ArrayList<Integer> divide(int totalMoney, int totalCount) {
        ArrayList<Integer> list=new ArrayList<>();
        //随机分配，有多有少
        //最少0.01rmb，最多剩余余额平均数的两倍
        Random random=new Random();
        int leftMoney=totalMoney;
        int leftCount=totalCount;
        for (int i = 0; i <totalCount-1 ; i++) {
            int money=random.nextInt(leftMoney/leftCount*2)+1;
            list.add(money);
            leftMoney-=money;
            leftCount--;
        }
        return list;
    }
}
    