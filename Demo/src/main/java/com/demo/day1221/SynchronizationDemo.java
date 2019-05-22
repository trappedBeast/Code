package com.demo.day1221;

/**
 * @ClassName SynchronizationDemo
 * @Auther trappedBeast
 * @Date 2018/12/21 16:09
 * @Version 1.0
 * @Description TODO
 **/
public class SynchronizationDemo {
    public static void main(String[] args) {
    /**
     * @Author trappedBeast
     * @Date 2018/12/21 16:29
     * @Description //线程不同步
     */

        new SynchronizationDemo().init();

    }

    private void init(){
        final Outputer outputer=new Outputer();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                   outputer.outPut("aaaaaaaaaaaaaaaaaaaaaaaaaaaaaa");

                }
            }
        }).start();


        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    outputer.outPut("bbbbbbbbbbbbbbbbbbbbbbbbbbbbbb");

                }
            }
        }).start();
    }


    class Outputer{

        public  void outPut(String name){
            int len=name.length();
            synchronized (this){
                for (int i = 0; i < len; i++) {
                    System.out.print(name.charAt(i));
                }
                System.out.println();
            }

        }
    }
}
    