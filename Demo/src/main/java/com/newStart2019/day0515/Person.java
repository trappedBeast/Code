package com.newStart2019.day0515;

/**
 * @ClassName Person
 * @Auther trappedBeast
 * @Date 2019/5/17 10:39
 * @Version 1.0
 * @Description TODO
 **/
public class Person implements Cloneable{
    private IdCard idCard;
    private int height;
    private int weight;


    public Person() {
    }

    public Person(IdCard idCard,int height,int weight) {
        this.idCard = idCard;
        this.height = height;
        this.weight = weight;
    }

    public IdCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IdCard idCard) {
        this.idCard = idCard;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "idCard=" + idCard +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }


}
    