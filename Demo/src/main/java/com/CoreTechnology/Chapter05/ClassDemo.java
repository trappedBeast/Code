package com.CoreTechnology.Chapter05;

import java.lang.reflect.Field;

/**
 * @ClassName ClassDemo
 * @Auther trappedBeast
 * @Date 2018/11/16 10:04
 * @Version 1.0
 * @Description TODO
 **/
public class ClassDemo {
    public int a;
    public int b;

    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
        /*Class clazz=new Person().getClass();*/
        /*Person person=new Person();
        System.out.println(clazz.toString());
        Class clazz01=Class.forName("com.CoreTechnology.Chapter05.Person");
        System.out.println(clazz01.toString());
        Field[] fields = clazz.getDeclaredFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }*/

          /*  Method[] method = clazz.getMethods();
        for (Method method1 : method) {
            System.out.println(method1.getName());
            int modifiers = method1.getModifiers();
            System.out.println(Modifier.isAbstract(modifiers));
        }*/

        Person person = new Person("郑超", 18);
        Class clazz = person.getClass();
        Field field = clazz.getDeclaredField("name");
        field.setAccessible(true);
        Object obj = field.get(person);
        Class<ClassDemo> classDemoClass = ClassDemo.class;
        Field[] fields = classDemoClass.getFields();

        for (Field field1 : fields) {
            System.out.println(field1.getName());
        }




    }
}
    