package com.example.demo.design.composite.sample;

/**
 * <h3>概要:</h3><p>Component</p>
 * <h3>功能:</h3><p>抽象组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 */
public interface Component{
    void add(Component c);
    void remove(Component c);
    Component getChild(int i);
    void operation(int depth);
}