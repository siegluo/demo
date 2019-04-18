package com.example.demo.design.template_method.example.print;

/**
 * <h3>概要:</h3><p>AbstractPrint</p>
 * <h3>功能:</h3><p>字符串实现类</p>
 * <h3>履历:</h3>
 * <li>2016年8月26日  v0.1 版本内容: 新建</li>
 */
public class StringPrint extends AbstractPrint{

    @Override
    protected void open() {
        System.out.println("==============================");
    }

    @Override
    protected void print(String text) {
        System.out.println(text);
    }

    @Override
    protected void close() {
        System.out.println("==============================");
    }
}