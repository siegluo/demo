package design.decorator.demo;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    protected void option() {
        a();
        super.option();
    }

    private void a() {
    }
}
