package com.demo.day1113;

/**
 * @ClassName Computer
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/13 16:11
 * @Version 1.0
 **/
public class Computer {
    public void powerOn(){
        System.out.println("笔记本电脑开机");
    }
    public void powerOff(){
        System.out.println("笔记本电脑关机");
    }

    public void UseDevice(Usb usb){
        usb.open();
        usb.close();
    }
}
    