package com.example.demo.design.observer.example.course;

/**
 * <h3>概要:</h3><p>OperType</p>
 * <h3>功能:</h3><p>OperType</p>
 * <h3>履历:</h3>
 * <li>2017年6月14日  v0.1 版本内容: 新建</li>
 */
public enum OperTypeEnum {

    /**
     * 1-新增
     */
    ADD(1),
    /**
     * 2-修改
     */
    UPDATE(2),
    /**
     * 3-删除
     */
    REMOVE(3);

    private Integer value;

    public Integer getValue() {
        return value;
    }

    private OperTypeEnum(Integer value) {
        this.value = value;
    }
}