package design.chain.demo;

public class AHandler implements Handler {

    private Handler successor;

    public AHandler(Handler successor) {
        this.successor = successor;
    }

    @Override
    public void handler() {
        if(true){

        }else {
            successor.handler();
        }

    }
}
