package com.example.demo.list;

import java.util.Arrays;

public class ArraySearch {

    public static void main(String[] args) {
        int i = Arrays.binarySearch(new int[]{1, 2}, 2);
        System.out.println(i);
    }
}
