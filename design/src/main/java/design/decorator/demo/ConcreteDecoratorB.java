package design.decorator.demo;

public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    protected void option() {
        b();
        super.option();
    }

    private void b() {
    }
}
