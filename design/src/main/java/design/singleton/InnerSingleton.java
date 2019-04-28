package design.singleton;

public class InnerSingleton {

    private static class Singleton {
        private static Singleton singleton = new Singleton();
    }

    public Singleton getInstance() {
        return Singleton.singleton;
    }

}
