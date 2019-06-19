package design.command;

public class CorrectCommand implements Commmand {
    private Receiver receiver;

    public void setReceiver(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void excute() {
        receiver.action();
    }
}
