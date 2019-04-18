package com.example.demo.design.composite.sample;

/**
 * <h3>概要:</h3><p>Leaf</p>
 * <h3>功能:</h3><p>叶子组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 */
class Leaf implements Component {
    @Override
    public void add(Component c) {
    }

    @Override
    public void remove(Component c) {
    }

    @Override
    public Component getChild(int i) {
        return null;
    }

    @Override
    public void operation(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre += "-";
        }
        System.out.println(pre + "leaf");
    }
}