package com.newStart2019.day0515;

import java.io.*;

/**
 * @ClassName DeepAndShallowCopy
 * @Auther trappedBeast
 * @Date 2019/5/17 10:38
 * @Version 1.0
 * @Description TODO
 **/
public class DeepAndShallowCopy {


    public void testMethod1(String s){
        s=" after update";

    }

    public void testMethod2(int i){
        ++i;
    }

    public void testMethod3(Person person){
        person.setHeight(188);
        person.setWeight(120);
    }



    public static void main(String[] args) throws CloneNotSupportedException, IOException {

        Person person=new Person();
        IdCard idCard=new IdCard();
        idCard.setName("zc");
        idCard.setAge(24);
        person.setWeight(140);
        person.setHeight(180);
        person.setIdCard(idCard);
        ByteArrayOutputStream bos=new ByteArrayOutputStream();
        ObjectOutputStream oos=new ObjectOutputStream(bos);
        oos.writeObject(person);
        oos.flush();
        ObjectInputStream ois=new ObjectInputStream(new ByteArrayInputStream(bos.toByteArray()));

        Person person1= person;
        person.setWeight(120);
        idCard.setAge(18);
        System.out.println(person);
        System.out.println(person1);

    }
}
    