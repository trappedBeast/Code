package com.CoreTechnology.Chapter06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @ClassName MyinvocationHandler
 * @Auther trappedBeast
 * @Date 2018/11/30 10:31
 * @Version 1.0
 * @Description TODO
 **/
public class MyinvocationHandler implements InvocationHandler {

    Object target;

    public MyinvocationHandler(Object object) {
        this.target = object;
    }

    @Override
    public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
        System.out.println("method name:"+method.getName());
        if("add".equals(method.getName()))
            if("apple".equals(args[0]))
                return false;

        return method.invoke(target,args);
    }
}
    