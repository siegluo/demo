package com.example.demo.design.observer.sample;

/**
 * <h3>概要:</h3><p>ConcreteObserver</p>
 * <h3>功能:</h3><p>具体的观察者类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class ConcreteObserver implements Observer {

    @Override
    public void update() {
        // 具体响应代码
        System.out.println("update");
    }
}