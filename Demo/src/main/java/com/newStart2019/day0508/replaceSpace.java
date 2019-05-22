package com.newStart2019.day0508;

/**
 * @ClassName replaceSpace
 * @Auther trappedBeast
 * @Date 2019/5/9 18:20
 * @Version 1.0
 * @Description TODO
 **/
public class replaceSpace {
    public static String replace(StringBuffer str) {
        StringBuilder sb=sb=new StringBuilder();;
        for(int i=0;i<str.length();i++){

            String s=new String(new char[]{str.charAt(i)});
            if(s.trim().isEmpty())
                sb.append("%20");
            else
                sb.append(s);
        }
        return sb.toString();

    }


    public static void main(String[] args) {
        System.out.println(replaceSpace.replace(new StringBuffer("We Are Happy")));
    }
}
    