package com.newStart2019.day0515;

import java.util.Objects;

/**
 * @ClassName IdCard
 * @Auther trappedBeast
 * @Date 2019/5/17 10:40
 * @Version 1.0
 * @Description TODO
 **/
public class IdCard implements Cloneable{
    private String name;
    private String gender;
    private int age;
    private String idNo;
    private String address;

    public IdCard() {
    }

    public IdCard(String name,String gender,int age,String idNo,String address) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.idNo = idNo;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getIdNo() {
        return idNo;
    }

    public void setIdNo(String idNo) {
        this.idNo = idNo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "IdCard{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", idNo='" + idNo + '\'' +
                ", address='" + address + '\'' +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdCard idCard = (IdCard) o;
        return age == idCard.age &&
                Objects.equals(name,idCard.name) &&
                Objects.equals(gender,idCard.gender) &&
                Objects.equals(idNo,idCard.idNo) &&
                Objects.equals(address,idCard.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,gender,age,idNo,address);
    }



}
    