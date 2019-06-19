package design.adapter.demo;

public class Adepter implements Target {

    private Adaptee adaptee;

    public Adepter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.smplieRequest();
    }
}
