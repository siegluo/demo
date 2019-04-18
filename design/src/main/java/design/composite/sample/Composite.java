package design.composite.sample;

import java.util.ArrayList;

/**
 * <h3>概要:</h3><p>Composite</p>
 * <h3>功能:</h3><p>容器组件</p>
 * <h3>履历:</h3>
 * <li>2017年6月19日  v0.1 版本内容: 新建</li>
 */
public class Composite implements Component {

    private ArrayList<Component> list = new ArrayList<Component>();

    @Override
    public void add(Component c) {
        list.add(c);
    }

    @Override
    public void remove(Component c) {
        list.remove(c);
    }

    @Override
    public Component getChild(int i) {
        return (Component) list.get(i);
    }

    @Override
    public void operation(int depth) {
        String pre = "";
        for (int i = 0; i < depth; i++) {
            pre += "-";
        }
        depth = depth + 4;
        System.out.println(pre + "composite");
        for (Object obj : list) {
            ((Component) obj).operation(depth);
        }

    }
}