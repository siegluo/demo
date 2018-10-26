package com.example.demo.spi;

public class SpiBImpl implements SpiApi{
    @Override
    public void sayHello() {
        System.out.println("spiB");
    }
}
