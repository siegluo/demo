package com.example.demo.design.state.example.color;

/**
 * <h3>概要:</h3><p>RedState</p>
 * <h3>功能:</h3><p>RedState</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public class RedState implements State {
    
    @Override
    public void pre(Context c) {
        c.setState(new YellowState());
    }

    @Override
    public void next(Context c) {
        c.setState(new GreenState());
    }

    @Override
    public String getCurState() {
        return ColorEnum.RED.toString();
    }
}
