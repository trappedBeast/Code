package com.CoreTechnology.Chapter06;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * @ClassName LamimaDemo
 * @Auther trappedBeast
 * @Date 2018/11/28 17:45
 * @Version 1.0
 * @Description TODO
 **/
public class LamimaDemo {
    public static void main(String[] args) {
        List<String> list= Arrays.asList(new String[]{"day0401","f","c","A"} );
        /*Collections.sort(list,new Comparator<String>() {
            @Override
            public int compare(String str1,String str2) {
                if(str1.compareTo(str2)==0)
                    return 0;
                return (str1.compareTo(str2)>0?-1:1);
            }
        });*/

        Collections.sort(list,(str1,str2)->str1.compareTo(str2));
        System.out.println(list);




    }
}
    