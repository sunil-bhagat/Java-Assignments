package sunil.incrementalassignment1;

public class Main {
    public static void main(String[] args) {
        Data data = new Data();
        data.printGlobal();
        data.printLocal();
        Singleton singleton = Singleton.create("initalized");
        singleton.printString();
    }
}
