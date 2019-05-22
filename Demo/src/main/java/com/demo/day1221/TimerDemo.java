package com.demo.day1221;

import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @ClassName TimerDemo
 * @Auther trappedBeast
 * @Date 2018/12/21 11:18
 * @Version 1.0
 * @Description TODO
 **/
public class TimerDemo {
    private static int count=0;
    public static void main(String[] args) {

    //内部类，自定义定时器任务类，继承抽象类TimerTask重写run方法
    class MyTimerTask extends TimerTask{
          @Override
          public void run() {
              count=(count+1)%2;
              System.out.println("炸");
              new Timer().schedule(new MyTimerTask(),2000+2000*count);
          }
      }


      new Timer().schedule(new MyTimerTask(),2000);

        while (true){
            System.out.println(LocalDateTime.now().getSecond());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
    