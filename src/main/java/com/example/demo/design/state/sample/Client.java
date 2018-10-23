package com.example.demo.design.state.sample;

/**
 * <h3>概要:</h3><p>Client</p>
 * <h3>功能:</h3><p>客户端</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Client {
    public static void main(String[] args) {
        State state = new ConcreteState1();
        Context context = new Context(state);
        context.request("a");
    }
}
