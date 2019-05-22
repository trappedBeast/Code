package com.demo.day1112;

/**
 * @ClassName User
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/12 17:43
 * @Version 1.0
 **/
public class User {
    private String userName;
    private double money;
    public User(){};

    public User(String userName, double money) {
        this.userName = userName;
        this.money = money;
    }

    public void show(){
        System.out.println("用户:"+this.userName+""+"余额:"+this.money);
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
    