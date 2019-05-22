package com.CoreTechnology.Chapter06;

/**
 * @ClassName ActorLiuDeHua
 * @Auther trappedBeast
 * @Date 2018/12/3 10:48
 * @Version 1.0
 * @Description TODO
 **/
public class ActorLiuDeHua implements Actor {
    @Override
    public void sing(String musicName) {
        System.out.println("刘德华唱了一首"+musicName);
    }

    @Override
    public void dance() {
        System.out.println("刘德华跳舞");

    }
}
    