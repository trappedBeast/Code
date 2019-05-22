package com.CoreTechnology.Chapter06;

import javax.swing.*;

/**
 * @ClassName TimeApp2
 * @Auther trappedBeast
 * @Date 2018/11/29 11:05
 * @Version 1.0
 * @Description TODO
 **/
public class TimeApp2 {
    public static void main(String[] args) {
        /*TalkingClock talkingClock=new TalkingClock(1000,false);
        talkingClock.start();*/
        TalkingClock talkingClock=new TalkingClock();
        talkingClock.start(1000,true);
        JOptionPane.showMessageDialog(null,"Quit message");
        System.exit(0);
    }
}
    