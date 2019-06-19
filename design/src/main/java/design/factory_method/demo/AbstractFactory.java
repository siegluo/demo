package design.factory_method.demo;

public abstract class AbstractFactory {
    protected abstract Procduct1 factoryMethod1();

    protected abstract Procduct2 factoryMethod2();

    public Procduct create() {
        Procduct1 procduct1 = factoryMethod1();
        Procduct2 procduct2 = factoryMethod2();
        Procduct procduct = new ConcreteProcduct();
        return procduct;
    }
}
