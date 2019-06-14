package com.example.demo.list;

import org.apache.commons.collections.CollectionUtils;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ListAdd {

    public static void main(String[] args) {
        List<Integer> a = new ArrayList<Integer>();
//        a.add(null);
        a.addAll(new ArrayList<>());
//        System.out.println(CollectionUtils.isNotEmpty(a));
        System.out.println(CollectionUtils.isNotEmpty(a));

//        AtomicInteger a = new AtomicInteger(0);
//        boolean c =true;
//        getCount1(a,c);
//        ArrayList<Integer> list = new ArrayList<>();
//        Integer d = 0;
//        Integer b = getCount2(d,list);
//        System.out.println(a);
//        Deque<Integer> a = new ArrayDeque<>();
//        ArrayList<Integer> b = new ArrayList<>();
////        a.push(1);
////        a.push(2);
//        for (int i = 0; i < 5; i++) {
//            Integer poll = a.pollLast();
//            a.push(poll);
//            b.add(poll);
//        }
//        System.out.println(a);
//        System.out.println(b);

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

    private static Integer getCount2(Integer a, ArrayList<Integer> list) {
        a += 1;
        a = Integer.valueOf(a + 1);
        list.add(a);
        return Integer.valueOf(3);
    }

    private static void getCount1(AtomicInteger a, boolean c) {
        a.incrementAndGet() ;
        c=false;
    }

}
