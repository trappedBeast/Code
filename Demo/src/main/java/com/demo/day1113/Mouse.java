package com.demo.day1113;

/**
 * @ClassName Mouse
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/13 16:14
 * @Version 1.0
 **/
public class Mouse implements Usb {
    @Override
    public void open() {
        System.out.println("打开鼠标");
    }

    @Override
    public void close() {
        System.out.println("关闭鼠标");

    }
}
    