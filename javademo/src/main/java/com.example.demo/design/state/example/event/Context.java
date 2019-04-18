package com.example.demo.design.state.example.event;

/**
 * <h3>概要:</h3><p>Context</p>
 * <h3>功能:</h3><p>环境类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public class Context {
    private State state;

    public void pre(){        
        state.pre(this);
        System.out.println("STATE : " + state.getCurState());
    }
    
    public void next(){
        state.next(this);
        System.out.println("STATE : " + state.getCurState());
    }
    
    public void disconnect(){	
        state.disconnect(this);
        System.out.println("STATE : " + state.getCurState());
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
