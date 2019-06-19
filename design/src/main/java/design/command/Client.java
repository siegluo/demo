package design.command;

public class Client {
    public static void main(String[] args) {
        CorrectCommand correctCommand = new CorrectCommand();
        correctCommand.setReceiver(new Receiver());
        Invoker invoker = new Invoker();
        invoker.setCommmand(correctCommand);
        invoker.invoke();
    }
}
