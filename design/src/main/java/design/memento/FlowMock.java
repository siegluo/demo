package design.memento;

public class FlowMock {
    private Integer a;
    private String state;

    void doA() {
        a = 1;
        state = "a";
    }

    void dpB() {
        a = 2;
        state = "b";
    }

    public FlowMockMemonto createMemonto() {
        FlowMockMemonto flowMockMemonto = new FlowMockMemonto();
        flowMockMemonto.setA(a);
        flowMockMemonto.setState(state);
        return flowMockMemonto;
    }

    public void setMemonto(FlowMockMemonto flowMockMemonto) {
        this.state = flowMockMemonto.getState();
        this.a = flowMockMemonto.getA();
    }
}
