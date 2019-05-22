package com.demo.day1115;

/**
 * @ClassName Body
 * @Auther trappedBeast
 * @Date 2018/11/15 17:51
 * @Version 1.0
 * @Description TODO
 **/
public class Body {
    public class Heart{
        int num=200;
        public void beat(){
            int num=300;
            System.out.println(num);
            System.out.println(this.num);
            System.out.println(Body.this.num);
        }
    }

    private int num=100;



    public void method(){
        System.out.println("外部类方法");
    }
}
    