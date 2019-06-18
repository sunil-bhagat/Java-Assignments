package sunil.incrementalassignment1.data;

public class Data {
    int globalInt;
    char globalChar;

   public  void printGlobal() {
        System.out.println(globalInt);
        System.out.println(globalChar);
    }

    public void printLocal() {
        int localInt;
        char localChar;
        /**System.out.println(localInt);
         *System.out.println(localChar);
         * local variable are not  given a default value in java.
         */
    }
}
