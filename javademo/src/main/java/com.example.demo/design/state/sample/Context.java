package com.example.demo.design.state.sample;

/**
 * <h3>概要:</h3><p>Context</p>
 * <h3>功能:</h3><p>环境类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Context {

    private State state;
    
    public Context(State state){
        this.state = state;
    }

    public void request(String param) {
        state.handle(param);
    }
}
