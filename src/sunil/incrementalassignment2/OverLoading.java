package sunil.incrementalassignment2;

public class OverLoading {
    OverLoading() {
        System.out.println("constructor with no arguments called");
    }

    OverLoading(String data) {
        this();
        System.out.println(data);
    }

    public static void main(String[] args) {
        OverLoading object = new OverLoading("constructor with one argument called");
    }
}
