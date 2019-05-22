package com.newStart2019.day0503;

/**
 * @ClassName Inner
 * @Auther trappedBeast
 * @Date 2019/5/3 22:16
 * @Version 1.0
 * @Description TODO
 **/
public class Outer {
    private int num=10;
    class Inner1{
        int num=20;
        public void say(){
            int num=30;
            System.out.println("Inner class method");
            System.out.println(num+""+this.num+""+Outer.this.num);
        }
    }

    static class Inner2{
        public void say(){
            System.out.println("static inner class method");
        }
    }

    private class Inner3{
        public void say(){
            System.out.println("private inner class method");
        }
    }


    public void mewInstance(){
        Inner3 inner3=new Inner3();
        inner3.say();
    }


    public void method(){
        class Inner4{
            int num=0;
            public void say(){
                System.out.println(num);
            }
        }

        Inner4 inner4=new Inner4();
        inner4.say();

    }

}
    