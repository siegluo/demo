package com.example.demo.design.composite.example.dept;

/**
 * <h3>概要:</h3><p>Dept</p>
 * <h3>功能:</h3><p>抽象组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public abstract class Dept {
    public abstract void add(Dept c);
    public abstract void remove(Dept c);
    public abstract void display(int depth);
}