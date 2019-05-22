package com.demo.day1113;

/**
 * @ClassName DemoMain
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/13 16:16
 * @Version 1.0
 **/
public class DemoMain {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.powerOn();
        Usb usb=new Mouse();
        computer.UseDevice(usb);
    }
}
    