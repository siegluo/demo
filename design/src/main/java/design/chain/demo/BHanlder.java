package design.chain.demo;

public class BHanlder implements Handler {
    
    private Handler successor;

    public BHanlder(Handler successor) {
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
