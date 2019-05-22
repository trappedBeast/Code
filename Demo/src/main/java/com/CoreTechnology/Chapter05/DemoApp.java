package com.CoreTechnology.Chapter05;

/**
 * @ClassName InterfaceImpl
 * @Auther trappedBeast
 * @Date 2018/11/19 14:34
 * @Version 1.0
 * @Description TODO
 **/
public class DemoApp {
    public static void main(String[] args) {
        Myinterface myinterface=new Myinterface() {
            @Override
            public void showMethod() {
                System.out.println("aaaaaaaaaaaaaa");
            }
        };

        myinterface.showMethod();
        ColorEnum red=ColorEnum.RED;
    }
}
    