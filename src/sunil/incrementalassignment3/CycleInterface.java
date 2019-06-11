package sunil.incrementalassignment3;

interface Cyclesi {
    void name();
}

interface CycleFactory {
    Cyclesi getCycle();
}

class Unicyclei implements Cyclesi {
    public void name() {
        System.out.println("Unicycle");
    }
}

class UnicycleFactory implements CycleFactory {
    public Cyclesi getCycle() {
        return new Unicyclei();
    }
}

class Bicyclei implements Cyclesi {
    public void name() {
        System.out.println("Bicycle");
    }
}

class BicycleFactory implements CycleFactory {
    public Cyclesi getCycle() {
        return new Bicyclei();
    }
}


class Tricyclei implements Cyclesi {

    public void name() {
        System.out.println("Tricycle");
    }
}

class TricycleFactory implements CycleFactory {
    public Cyclesi getCycle() {
        return new Tricyclei();
    }
}

public class CycleInterface {
    public static void getCycles(CycleFactory factory) {
        Cyclesi cycle = factory.getCycle();
        cycle.name();
    }
    public static void main(String [] args) {
        Cyclesi uni = new UnicycleFactory().getCycle();
        Cyclesi tri = new TricycleFactory().getCycle();
        Cyclesi bi = new BicycleFactory().getCycle();
        uni.name();
        tri.name();
        bi.name();

    }
}
