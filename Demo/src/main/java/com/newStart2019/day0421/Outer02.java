package com.newStart2019.day0421;

/**
 * @ClassName Outer02
 * @Auther trappedBeast
 * @Date 2019/4/22 23:35
 * @Version 1.0
 * @Description TODO
 **/
public class Outer02 {
    private int num=10;
    class Inner{
        private int num=20;
        public void show(){
            int num=30;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Outer02.this.num);
        }
    }
}
    