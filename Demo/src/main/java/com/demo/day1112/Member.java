package com.demo.day1112;

import java.util.List;
import java.util.Random;

/**
 * @ClassName Member
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/12 19:09
 * @Version 1.0
 **/
public class Member extends User {
    public Member() {
    }

    public Member(String userName, double money) {
        super(userName, money);
    }


    public void receive(List<Double> list){
        int index=new Random().nextInt(list.size());
        double delta = list.remove(index);
        super.setMoney(delta+super.getMoney());
    }
}
    