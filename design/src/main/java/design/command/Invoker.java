package design.command;

public class Invoker {
    private Commmand commmand;

    public void setCommmand(Commmand commmand) {
        this.commmand = commmand;
    }

    public void invoke() {
        commmand.excute();
    }
}
