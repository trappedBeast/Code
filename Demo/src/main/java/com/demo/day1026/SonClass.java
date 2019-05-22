package com.demo.day1026;


/**
 * @ClassName SonClass
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/10/26 15:40
 * @Version 1.0
 **/
public class SonClass extends fatherClass {
    int a=20;
    @Override
    public void method1() {

        System.out.println("子类方法");
       // super.method1();

    }

    public void showNum(){
        System.out.println(this.a);
    }

    public static void main(String[] args) {
        fatherClass fatherClass=new SonClass();
        fatherClass.method1();
        fatherClass.showNum();
    }
}

    