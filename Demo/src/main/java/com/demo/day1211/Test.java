package com.demo.day1211;

import java.io.File;
import java.io.FileReader;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @ClassName Test
 * @Auther trappedBeast
 * @Date 2018/12/11 19:36
 * @Version 1.0
 * @Description TODO
 **/
public class Test {
    public static void main(String[] args) throws Exception {
        File file = new File("com/demo/day1211/config.properties");

        System.out.println(file.exists());
        FileReader r=new FileReader("config.properties");
        Properties pro=new Properties();
        pro.load(r);
        r.close();
        String className=pro.getProperty("className");
        String methodName=pro.getProperty("methodName");
        Class c=Class.forName(className);
        Object obj=c.newInstance();
        Method method = c.getMethod(methodName);
        method.invoke(obj,"aaaaaaaaaaa");


    }
}
    