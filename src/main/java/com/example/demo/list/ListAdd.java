package com.example.demo.list;

import java.util.*;

public class ListAdd {

    public static void main(String[] args) {
        Deque<Integer> a = new ArrayDeque<>();
        ArrayList<Integer> b = new ArrayList<>();
//        a.push(1);
//        a.push(2);
        for (int i = 0; i < 5; i++) {
            Integer poll = a.pollLast();
            a.push(poll);
            b.add(poll);
        }
        System.out.println(a);
        System.out.println(b);

//        List arrayList = new ArrayList<>();
//        List linkedList = new LinkedList<>();
//
//        arrayList.add(1);
//        arrayList.add(2);
//        arrayList.add(1);
//        arrayList.add(null);
//        arrayList.add(2);
//        System.out.println(arrayList);
////        arrayList.remove(new Integer(2));
//        arrayList.remove(2);
//        System.out.println(arrayList);
//        System.out.println(arrayList.indexOf(null));
//
//        linkedList.add(1);
//        linkedList.add(2);
//        linkedList.add(1);
//        linkedList.add(null);
//        linkedList.add(2);
//        System.out.println(linkedList);
////        linkedList.remove(new Integer(2));
//        linkedList.remove(2);
//        System.out.println(linkedList);
//        System.out.println(linkedList.indexOf(null));
    }

}
