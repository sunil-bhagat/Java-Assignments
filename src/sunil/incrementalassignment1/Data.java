package sunil.incrementalassignment1;

public class Data {
    int globalInt;
    char globalChar;

    void printGlobal() {
        System.out.println(globalInt);
        System.out.println(globalChar);
    }

    void printLocal() {
        int localInt;
        char localChar;
        /**System.out.println(localInt);
         *System.out.println(localChar);
         * local variable are not  given a default value in java.
         */
    }
}
