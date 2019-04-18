package com.example.demo.design.state.example.color;

/**
 * <h3>概要:</h3><p>State</p>
 * <h3>功能:</h3><p>状态类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public interface State {
    void pre(Context c);

    void next(Context c);

    String getCurState();
}
