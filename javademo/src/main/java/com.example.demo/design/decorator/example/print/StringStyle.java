package com.example.demo.design.decorator.example.print;

/**
 * <h3>概要:</h3><p>StringStyle</p>
 * <h3>功能:</h3><p>具体组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class StringStyle extends AbstractStyle {

    @Override
    public void print(String str) {
        System.out.println(str);
    }
}
