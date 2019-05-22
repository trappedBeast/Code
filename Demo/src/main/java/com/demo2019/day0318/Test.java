package com.demo2019.day0318;

/**
 * @ClassName Test
 * @Auther trappedBeast
 * @Date 2019/3/18 13:24
 * @Version 1.0
 * @Description TODO
 **/
public class Test {
    public static void operator(StringBuffer a,StringBuffer b){
        a.append(b);
        b=a;
    }


    public static void main(String[] args) {
        StringBuffer  x= new StringBuffer("A");
        StringBuffer  y= new StringBuffer("B");
        operator(x,y);
        System.out.println(x+","+y);

    }
}
    