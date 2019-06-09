package sunil.incrementalassignment1;

public class Singleton {
    String test;

    static Singleton create(String string) {
        /**test = string;
         * we can initialized test as it is static variable and it can not be called from a non-static method.
         */
        return new Singleton();
    }

    void printString() {
        System.out.println(test);
    }
}
