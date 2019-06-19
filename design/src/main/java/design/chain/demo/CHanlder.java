package design.chain.demo;

public class CHanlder implements Handler {

    private Handler successor;

    public CHanlder(Handler successor) {
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
