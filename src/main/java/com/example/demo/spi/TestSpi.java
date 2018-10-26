package com.example.demo.spi;

public class TestSpi {
    public static void main(String[] args) {
        Thread thread = new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        System.out.println("1");
                    }
                }
        );
        thread.start();
        for (int i = 0; i < 10000; i++) {
            i++;
        }
        System.out.println("www");
    }
}
