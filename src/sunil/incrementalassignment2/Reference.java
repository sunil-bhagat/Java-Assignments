package sunil.incrementalassignment2;

public class Reference {
    Reference(String data){
        System.out.println(data);
    }

    public static void main(String[] args) {
        Reference[] r = new Reference[1];
        /**
         * constructor only prints the arguments when we create objects.
         */
        r[0] = new Reference("reference attached.");
    }
}
