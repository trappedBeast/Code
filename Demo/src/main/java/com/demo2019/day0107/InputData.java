package com.demo2019.day0107;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @ClassName InputData
 * @Auther trappedBeast
 * @Date 2019/1/7 17:14
 * @Version 1.0
 * @Description TODO
 **/
public abstract class InputData<T> {
    private BufferedReader buf=null;
    private final String DOU_REGULAR="^(-?\\d+)(\\.\\d+)?$";//浮点数
    private final String INT_REGULAR="^-?\\d+$";//整数
    public InputData() {
        this.buf = new BufferedReader(new InputStreamReader(System.in));
    }

    public String getStringValue(String prompt) throws IOException {
        String str=null;
        System.out.println(prompt);
        str=this.buf.readLine();
        return str;

    }


    /*public int getIntValue(String prompt,String err){
        

    }*/

    public abstract T getObject();



}
    