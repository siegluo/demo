package com.example.demo.design.observer.sample;

/**
 * <h3>概要:</h3><p>ConcreteSubject</p>
 * <h3>功能:</h3><p>具体的目标类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
class ConcreteSubject extends Subject {
    /**
     * 通知方法
     */
    @Override
    public void notifyObserver() {
        for (Object observer : observers) {
            ((Observer) observer).update();
        }
    }
}