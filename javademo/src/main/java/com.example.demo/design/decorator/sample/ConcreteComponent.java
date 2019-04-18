package com.example.demo.design.decorator.sample;

/**
 * <h3>概要:</h3><p>ConcreteComponent</p>
 * <h3>功能:</h3><p>具体组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class ConcreteComponent extends Component {
    @Override
    public void execute() {
        System.out.println("ConcreteComponent method execute!");
    }
}
