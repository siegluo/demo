package com.example.demo.design.state.sample;

/**
 * <h3>概要:</h3><p>ConcreteState1</p>
 * <h3>功能:</h3><p>具体状态类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class ConcreteState2 implements State{
    @Override
    public void handle(String param) {
        System.out.println("ConcreteState2 handle ：" + param);
    }
}
