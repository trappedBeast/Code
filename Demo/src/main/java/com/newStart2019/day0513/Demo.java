package com.newStart2019.day0513;

import java.util.ArrayList;
import java.util.Stack;

/**
 * @ClassName Demo
 * @Auther trappedBeast
 * @Date 2019/5/13 15:58
 * @Version 1.0
 * @Description TODO
 **/
public class Demo {
    public static void main(String[] args) {
        ListNode listNode=new ListNode(1);

        System.out.println(printListForTailToHead(listNode));
    }


    public static ArrayList printListForTailToHead(ListNode listNode){
        Stack<Integer> stack=new Stack <>();
        while (listNode!=null){
            stack.push(listNode.val);
            listNode=listNode.next;
        }
        ArrayList<Integer> list=new ArrayList <>();
        while (!stack.isEmpty()){
            list.add(stack.pop());
        }
        return list;

    }




}
    