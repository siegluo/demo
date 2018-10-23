package com.example.demo.design.singleton.sample;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * <h3>概要:</h3><p>SingletonReg</p>
 * <h3>功能:</h3><p>单例模式【单例注册表】</p>
 * <h3>履历:</h3>
 * <li>2017年1月19日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class SingletonReg {
    private final static Map<String, Object> singletonObjects = new ConcurrentHashMap<String, Object>(64);

    static {
        SingletonReg singletonReg = new SingletonReg();
        singletonObjects.put(singletonReg.getClass().getName(), singletonReg);
    }

    private SingletonReg() {}

    public static SingletonReg getInstance(String name) {
        if (name == null) {
            name = "com.lianggzone.designpattern.singleton.sample.SingletonReg";
        }
        if (singletonObjects.get(name) == null) {
            try {
                singletonObjects.put(name, Class.forName(name).newInstance());
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
        return (SingletonReg) singletonObjects.get(name);
    }
}
