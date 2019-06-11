package sunil.incrementalassignment3;

/**
 * @author Sunil Bhagat
 */

public class Cycle {
    public static void main(String[] args) {
        //upcasting
        Cycle[] cycles = {
                new Unicycle(),
                new Bicycle(),
                new Tricycle(),
        };
        /** compile time error : can not find method balance in Cycle class.
         * for (Cycle c : cycles) {
         *       c.balance();
         *  }
         */
        //downcasting
        ((Unicycle) cycles[0]).balance();
        ((Bicycle) cycles[1]).balance();
        /**
         * Compile time error: no balance() in Tricycle.
         * (Tricycle)ride[2]).balance();
         */


    }
}

class Unicycle extends Cycle {
    void balance() {
        System.out.println("Unicycle needs to be balanced.");
    }
}

class Bicycle extends Cycle {
    void balance() {
        System.out.println("Bicycle needs to be balanced.");
    }
}

class Tricycle extends Cycle {
}
