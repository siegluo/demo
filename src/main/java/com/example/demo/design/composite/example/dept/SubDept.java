package com.example.demo.design.composite.example.dept;

import java.util.ArrayList;

/**
 * <h3>概要:</h3><p>SubDept</p>
 * <h3>功能:</h3><p>容器组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 */
public class SubDept extends Dept{

    private ArrayList<Dept> list = new ArrayList<Dept>();
    private String name;

    public SubDept(String name) {
        this.name = name;
    }

    @Override
    public void add(Dept c) {
        list.add(c);
    }

    @Override
    public void remove(Dept c) {
        list.remove(c);
    }

    @Override
    public void display(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre += "-";
        }
        depth = depth + 4;
        System.out.println(pre + name);
        for (Object obj : list) {
            ((Dept) obj).display(depth);
        }
    }
}