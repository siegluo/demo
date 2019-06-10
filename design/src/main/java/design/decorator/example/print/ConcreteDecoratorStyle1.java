package design.decorator.example.print;

/**
 * <h3>概要:</h3><p>ConcreteDecorator</p>
 * <h3>功能:</h3><p>具体装饰类</p>
 * <h3>履历:</h3>
 * <li>2017年6月13日  v0.1 版本内容: 新建</li>
 */
public class ConcreteDecoratorStyle1 extends DecoratorStyle{
    public ConcreteDecoratorStyle1(AbstractStyle style) {
        super(style);
    }

    @Override
    public void print(String str) {
        System.out.println("==========");
        super.print(str);
        System.out.println("==========");
    }
}
