package com.example.demo.StringBuffer;

public class StringBufferDemo {
    //值传递与引用传递
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("hello");
        StringBuffer b = new StringBuffer("word");
        String c = "haha";
        append1(c);
        append(a, b);
        System.out.println(a + "  " + b + "   " + c);
    }

    //String 是不可变的
    private static void append1(String c) {
        c+="world";
    }

    private static void append(StringBuffer a, StringBuffer b) {
        a.append("word");
        b = a;
    }


}
