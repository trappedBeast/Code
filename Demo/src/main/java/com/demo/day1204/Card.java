package com.demo.day1204;

import java.util.*;

/**
 * @ClassName Card
 * @Auther trappedBeast
 * @Date 2018/12/4 13:04
 * @Version 1.0
 * @Description TODO
 **/
public class Card {
    private String flowerColor;
    private String faceValue;
    private static final String [] flowerColors={"♠","♥","♣","♦"};
    private static final String [] faceValues={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};


    public Card(){
        this.faceValue="";
        this.flowerColor="";
    }



    private Card(String flowerColor,String faceValue) {
        this.flowerColor = flowerColor;
        this.faceValue = faceValue;
    }

    private Card(String faceValue) {

        this.faceValue = faceValue;
    }



    public String getFlowerColor() {
        return flowerColor;
    }

    public void setFlowerColor(String flowerColor) {
        this.flowerColor = flowerColor;
    }

    public String getFaceValue() {
        return faceValue;
    }

    public void setFaceValue(String faceValue) {
        this.faceValue = faceValue;
    }

    public String showCardInfo(){
        return this.flowerColor+this.faceValue;
    }

    @Override
    public String toString() {
        return this.flowerColor+this.faceValue;
    }

    /**
     * @Author trappedBeast
     * @Description //产生一副牌
     * @Date 2018/12/6 9:45
     * @Param []
     * @return java.util.Map
     */
    public static Map getCards(){
        Map<Integer,Card> map=new LinkedHashMap <>();
        map.put(0,new Card("红","鬼"));
        map.put(1,new Card("黑","鬼"));
        Card [] cards=new Card[54];
        int index=2;
        for (String faceValue : faceValues) {
            for (String flowerColor:flowerColors){
                map.put(index,new Card(flowerColor,faceValue));
                index++;
            }
        }
        return map;
    }

    /**
     * @Author trappedBeast
     * @Description //洗牌
     * @Date 2018/12/6 11:20
     * @Param [map]
     * @return java.util.List
     */
    public static List shuffleCard(Map<Integer,Card> map){
        Set<Integer> set=map.keySet();
        List<Integer> list=new ArrayList <>(set);
        Collections.shuffle(list);
        return list;
    }


}
    