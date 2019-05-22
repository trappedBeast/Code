package com.demo.day1109;

/**
 * @ClassName NewPhone
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/9 9:55
 * @Version 1.0
 **/
public class NewPhone extends Phone {
    @Override
    public void show() {
        super.show();
        System.out.println("显示姓名");
        System.out.println("显示头像");
    }

    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.call();
        phone.sendMsg();
        phone.show();
        System.out.println("=======================");
        NewPhone newPhone=new NewPhone();
        newPhone.call();
        newPhone.sendMsg();
        newPhone.show();
        System.out.println("==============================");
        Phone phone1=new NewPhone();
        phone1.show();
    }
}
    