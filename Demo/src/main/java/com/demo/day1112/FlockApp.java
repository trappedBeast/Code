package com.demo.day1112;

import java.util.List;

/**
 * @ClassName FlockApp
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/12 19:17
 * @Version 1.0
 **/
public class FlockApp{
    public static void main(String[] args) {
        Manager manager=new Manager("群主",2000);
        Member memberOne= new Member("成员一",0);
        Member memberTwo=new Member("成员二",0);
        Member MemberThree=new Member("成员三",0);
        List<Double> send = manager.send(20, 3);
        memberOne.receive(send);
        memberTwo.receive(send);
        MemberThree.receive(send);
        System.out.println(manager.getMoney());
        System.out.println(memberOne.getMoney());
        System.out.println(memberTwo.getMoney());
        System.out.println(MemberThree.getMoney());
    }


}
    