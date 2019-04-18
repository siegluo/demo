package com.example.demo.design.decorator.sample;

/**
 * <h3>概要:</h3><p>ConcreteDecorator</p>
 * <h3>功能:</h3><p>具体装饰类</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class ConcreteDecorator extends Decorator{
    public ConcreteDecorator(Component component) {
        super(component);

    }

    @Override
    public void execute() {
        super.execute();
        System.out.println("ConcreteDecorator method execute!");
    }
}
