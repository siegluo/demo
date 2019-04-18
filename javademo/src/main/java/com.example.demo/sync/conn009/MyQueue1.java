package com.example.demo.sync.conn009;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicInteger;

public class MyQueue1<T> {

    private LinkedList<T> linkedList = new LinkedList<>();

    private AtomicInteger count = new AtomicInteger(0);

    private final Integer mixSize;

    private Integer minSize = 0;

    public MyQueue1(Integer mixSize) {
        this.mixSize = mixSize;
    }

    public void put(T t) {
        synchronized (this) {
            if (count.get() == mixSize) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            linkedList.add(t);
            count.incrementAndGet();
            this.notify();
        }
    }

    public T take() {
        synchronized (this) {
            if (count.get() == minSize) {
                try {
                    this.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            count.decrementAndGet();
            this.notify();
            return linkedList.getFirst();
        }
    }
}
