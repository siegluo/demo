package design.mediator;

public abstract class Colleague {
    protected Mediator mediator;
    protected  void change(){
        mediator.change(this);
    }
}
