package com.example.demo.design.decorator.sample;

/**
 * <h3>概要:</h3><p>Decorator</p>
 * <h3>功能:</h3><p>抽象装饰类</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public abstract class Decorator extends Component{
    private Component component;
    
    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void execute() {
        if(component != null){
            component.execute();
        }
    }
}
