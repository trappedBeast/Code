package com.demo.day1220;

/**
 * @ClassName ThreadDemo
 * @Auther trappedBeast
 * @Date 2018/12/20 18:15
 * @Version 1.0
 * @Description TODO
 **/
public class ThreadDemo {
    public static void main(String[] args) {
        Thread thread1=new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("0"+Thread.currentThread().getName());

                }
            }
        };



        Thread thread2=new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("33333333333"+Thread.currentThread().getName());
                }
            }
        });
        thread2.start();



        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }


                    System.out.println("0000000000000");
                }
            }
        }){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                    System.out.println("111111111111111");
                }
            }
        }.start();
    }

}
    