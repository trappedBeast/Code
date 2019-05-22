package com.CoreTechnology.Chapter06;

/**
 * @ClassName ProxyDemo02
 * @Auther trappedBeast
 * @Date 2018/12/3 11:00
 * @Version 1.0
 * @Description TODO
 **/
public class ProxyDemo02 {
    public static void main(String[] args) {
        Actor actor=ProxyLiuDeHua.getProxyLiuDeHua();
        actor.sing("忘情水");
        actor.dance();

    }
}
    