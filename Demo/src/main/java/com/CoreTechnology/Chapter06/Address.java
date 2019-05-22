package com.CoreTechnology.Chapter06;

/**
 * @ClassName Address
 * @Auther trappedBeast
 * @Date 2018/11/28 11:26
 * @Version 1.0
 * @Description TODO
 **/
public class Address implements Cloneable{
    private String add;

    public Address(String add) {
        this.add = add;
    }

    public Address() {
    }

    public String getAdd() {
        return add;
    }


    public void setAdd(String add) {
        this.add = add;
    }

    @Override
    public String toString() {
        return "Address{" +
                "add='" + add + '\'' +
                '}';
    }
    @Override
    public Object clone(){
        Address address=null;
        try {
            address= (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }

}
    