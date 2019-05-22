package com.CoreTechnology.Chapter06;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.util.logging.Logger;

/**
 * @ClassName TalkingClock
 * @Auther trappedBeast
 * @Date 2018/11/29 10:13
 * @Version 1.0
 * @Description TODO
 **/
public class TalkingClock {
    private static Logger logger=Logger.getLogger("TalkingClock");
    private int interval;
    private boolean beep;


    public TalkingClock(int interval,boolean beep) {
        this.interval = interval;
        this.beep = beep;
    }

    public TalkingClock() {
    }


    public void start(){
        System.out.println("start");
        ActionListener listener=this.new TimePrint();
        Timer t=new Timer(interval,listener);
        t.start();
    }



    public void start(int interval){
        //局部内部类
        class TimePrint implements ActionListener{

            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LocalDateTime.now());
                if(TalkingClock.this.beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        }
        ActionListener listener=new TimePrint();
        Timer timer=new Timer(interval,listener);
        timer.start();
    }

    //匿名内部类
    public void start(int interval,boolean beep){
        ActionListener listener=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(LocalDateTime.now());
                if(beep)
                    Toolkit.getDefaultToolkit().beep();
            }
        };
        Timer timer=new Timer(interval,listener);
        timer.start();
    }


    //内部类
    private class TimePrint implements ActionListener{
       final static int a=1;

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println(LocalDateTime.now());
            if(TalkingClock.this.beep)
                Toolkit.getDefaultToolkit().beep();
        }
    }
}
    