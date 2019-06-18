package sunil.incrementalassignment1;

public class Singleton {
    String test;
    private static Singleton instance;
    private Singleton(String string){
        test = string;
    }

    static Singleton create(String string) {
        if(instance==null){
            instance  =  new Singleton(string);
        }
        return instance;
    }

    void printString() {
        System.out.println(test);
    }
}
