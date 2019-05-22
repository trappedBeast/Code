package com.demo.day1106;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName MathDemo01
 * @Description TODO
 * @Auther trappedBeast
 * @Date 2018/11/7 17:41
 * @Version 1.0
 **/
public class MathDemo01 {
    public static void main(String[] args) {
        Map<String,Double> range=new HashMap();
        range.put("start",-10.2);
        range.put("end",5.9);
        Map<String,Double> compareValue=new HashMap();
        compareValue.put("max",6.0);
        compareValue.put("min",2.1);
        MathDemo01 demo01=new MathDemo01();
        demo01.sum(range,compareValue);


    }

    public void sum(Map<String,Double> range, Map<String,Double> compareValue){
        int sum=0;
        for(double i= Math.ceil(range.get("start"));i<range.get("end");i++){
            if (Math.abs(i)>compareValue.get("max") || Math.abs(i)<compareValue.get("min")){
                ++sum;
                System.out.println(i);
            }

        }
        System.out.println("sum:"+sum);


    }
}
    