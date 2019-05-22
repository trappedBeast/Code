package com.demo.day1204;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @ClassName PukeApp
 * @Auther trappedBeast
 * @Date 2018/12/6 11:02
 * @Version 1.0
 * @Description TODO
 **/
public class PukeApp {
    public static void main(String[] args) {
        Map<Integer,Card> map=Card.getCards();
        List<Integer> list=Card.shuffleCard(map);
        System.out.println(list);
        List<Integer> player01=new ArrayList <>();
        List<Integer> player02=new ArrayList <>();
        List<Integer> player03=new ArrayList <>();
        for (int i = 0; i <list.size() ; i++) {
            if (i >= 51)
                break;
            if (i % 3 == 0) player01.add(list.get(i));
            if (i % 3 == 1) player02.add(list.get(i));
            if (i % 3 == 2) player03.add(list.get(i));
        }

        System.out.println(player01);
        System.out.println(player02);
        System.out.println(player03);

    }
}
    