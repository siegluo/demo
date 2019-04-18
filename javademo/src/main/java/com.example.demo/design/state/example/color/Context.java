package com.example.demo.design.state.example.color;

/**
 * <h3>概要:</h3><p>Context</p>
 * <h3>功能:</h3><p>环境类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class Context {
    private State state;

    public void pre(){
        state.pre(this);
    }

    public void next(){
        state.next(this);
    }

    public String getCurState(){
        return state.getCurState();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
