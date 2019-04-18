package com.example.demo.design.decorator.example.print;

/**
 * <h3>概要:</h3><p>Decorator</p>
 * <h3>功能:</h3><p>抽象装饰类</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class DecoratorStyle extends AbstractStyle{
    private AbstractStyle style;

    public DecoratorStyle(AbstractStyle style){
        this.style = style;
    }

    @Override
    public void print(String str) {
        if(style != null){
            style.print(str);
        }
    }
}
