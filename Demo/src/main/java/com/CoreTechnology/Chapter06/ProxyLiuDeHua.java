package com.CoreTechnology.Chapter06;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName ProxyLiuDeHua
 * @Auther trappedBeast
 * @Date 2018/12/3 10:49
 * @Version 1.0
 * @Description TODO
 **/
public class ProxyLiuDeHua {
    private static Actor actor=new ActorLiuDeHua();

    public static Actor getProxyLiuDeHua(){
        return (Actor) Proxy.newProxyInstance(ActorLiuDeHua.class.getClassLoader(),actor.getClass().getInterfaces(),new InvocationHandler() {
            @Override
            public Object invoke(Object proxy,Method method,Object[] args) throws Throwable {
                if (method.getName().equals("sing")){
                    System.out.println("我是他的经纪人，要找他唱歌得先给十万块钱");
                    return method.invoke(actor,args);
                }
                if (method.getName().equals("dance")){
                    System.out.println("我是他的经纪人，要找他跳舞得先给二十万块钱！");
                    return method.invoke(actor,args);
                }



                return null;
            }
        });

    }
}
    