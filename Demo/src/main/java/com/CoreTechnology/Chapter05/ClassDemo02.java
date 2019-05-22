package com.CoreTechnology.Chapter05;

import java.lang.reflect.*;

/**
 * @ClassName ClassDemo02
 * @Auther trappedBeast
 * @Date 2018/11/22 14:32
 * @Version 1.0
 * @Description TODO
 **/
public class ClassDemo02 {
    public static void main(String[] args) {
        String refAdress = "com.CoreTechnology.Chapter05.Manager";
        try {
            Class clazz = Class.forName(refAdress);

            //Field field = clazz.getField("bonus");只能得到共有域
            Field declaredField = clazz.getDeclaredField("bonus");
            //Field[] fields = clazz.getFields();
            Field[] declaredFields = clazz.getDeclaredFields();
            Method method = clazz.getMethod("sumSalary");
            Method[] methods = clazz.getMethods();
            Method declaredMethod = clazz.getDeclaredMethod("sumSalary");
            Method[] declaredMethods = clazz.getDeclaredMethods();
            declaredField.setAccessible(true);
            String name = declaredField.getName();
            System.out.println(name);
            Constructor constructor = clazz.getConstructor();
            Employee employee= (Employee) constructor.newInstance();
            Class declaringClass = clazz.getDeclaringClass();
            boolean aPrivate = Modifier.isPrivate(declaredField.getModifiers());
            System.out.println(aPrivate);
        } catch (ClassNotFoundException e) {
            System.out.println(e + "类找不到");
        } catch (NoSuchFieldException e) {
            System.out.println(e + "找不到字段");
        } catch (NoSuchMethodException e) {
            System.out.println("找不到方法");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }



    public static Object goodCopyOf(Object obj,int newLength){
        Class clazz=obj.getClass();
        if(!clazz.isArray()){
            return null;
        }
        Class componentType = clazz.getComponentType();
        int length = Array.getLength(obj);
        Object newArray=Array.newInstance(componentType,newLength);
        System.arraycopy(obj,0,newArray,0,Math.min(length,newLength));
        return newArray;
    }
}
    