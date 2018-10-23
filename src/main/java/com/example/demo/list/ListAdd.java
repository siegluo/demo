package com.example.demo.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListAdd {

    public static void main(String[] args) {
        List arrayList = new ArrayList<>();
        List linkedList = new LinkedList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(null);
        arrayList.add(2);
        System.out.println(arrayList);
//        arrayList.remove(new Integer(2));
        arrayList.remove(2);
        System.out.println(arrayList);
        System.out.println(arrayList.indexOf(null));

        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(1);
        linkedList.add(null);
        linkedList.add(2);
        System.out.println(linkedList);
//        linkedList.remove(new Integer(2));
        linkedList.remove(2);
        System.out.println(linkedList);
        System.out.println(linkedList.indexOf(null));
    }

}
