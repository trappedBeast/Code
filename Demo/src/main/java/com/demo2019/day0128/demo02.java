package com.demo2019.day0128;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName demo02
 * @Auther trappedBeast
 * @Date 2019/2/27 15:59
 * @Version 1.0
 * @Description TODO
 **/
public class demo02 {

    public static boolean MapIsEmpty(String[] keyArray,Map<String,String> map){
        boolean flag=false;
        if(null==map || map.isEmpty()){
            return flag;
        }
        Set <String> keys = map.keySet();
        for(String key:keyArray){
            flag=false;
            if(keys.contains(key)){
                if (map.get(key).isEmpty()){
                    return flag;

                }else {
                    flag=true;
                }
            }else{
                return flag;
            }

        }
        return flag;
    }

    public static void main(String[] args) {
        String[] keys={"ID_NO","ID_TYPE","MAIN_NAME","MAIN_TYPE","PARAM_TYPE"};
        Map <String, String> map = new HashMap <>();
        map.put("ID_NO","");
        map.put("ID_TYPE","2");
        map.put("MAIN_NAME","1");
        map.put("MAIN_TYPE","3");
        map.put("PARAM_TYPE","4");
        boolean b = demo02.MapIsEmpty(keys,map);
        System.out.println(b);

    }
}
    