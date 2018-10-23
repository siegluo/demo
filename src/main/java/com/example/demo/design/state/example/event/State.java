package com.example.demo.design.state.example.event;

/**
 * <h3>概要:</h3><p>State</p>
 * <h3>功能:</h3><p>状态类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public interface State {
    void pre(Context c);

    void next(Context c);

    void disconnect(Context c);

    String getCurState();
}
