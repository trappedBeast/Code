package com.demo2019.day0128;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Father
 * @Auther trappedBeast
 * @Date 2019/2/1 14:36
 * @Version 1.0
 * @Description TODO
 **/
public class demo {
    public static void main(String[] args) {
        /*ArrayList <Object> objects = new ArrayList <>();
        boolean empty = objects.isEmpty();
        System.out.println(empty);*/
//        Map<Object, Object> map = new HashMap <>();
//        map.put("aaa","aaa");
//        System.out.println(map.toString());
         /* Date nowDate=new Date();
        DateFormat df=new SimpleDateFormat("yyyyMMdd");
        String year=df.format(nowDate);*/
       /* String startTime=year+"0101";
        String endTime=String.valueOf(Integer.parseInt(year)+1)+"0101";
        System.out.println(startTime);
        System.out.println(endTime);*/
        /*System.out.println(year);
        HashMap <Object, Object> map = new HashMap <>();
        if (map.isEmpty()){
            System.out.println(111);
        }*/


        /*String str="01231231";
        boolean b = str.startsWith("1");
        System.out.println(b);*/
        HashMap <String, String> map = new HashMap <>();
        HashMap <String, String> map1 = new HashMap <>();
        map.put("0","0");
        map.put("2","2");
        map1.put("1","1");
        map1.put("3","3");
        //map.putAll(map1);
        //Set <Map.Entry <String, String>> entries = map.entrySet();
        for(Map.Entry <String, String> aa:map.entrySet()){

            map1.put(aa.getKey(),aa.getValue());
        }

       


        System.out.println(map1);


    }
}
    