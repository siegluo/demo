package design.flyweight;

public class ConcreteFlyWeight implements FlyWeight {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public void option() {

    }
}
