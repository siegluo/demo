package com.example.demo.design.state.sample;

/**
 * <h3>概要:</h3><p>State</p>
 * <h3>功能:</h3><p>状态类</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 * @since 0.1
 */
public interface State {

    /*
     * 定义一个接口，用以封装环境（Context）对象的一个特定的状态所对应的行为。
     */
    void handle(String param);
}
