package sunil.incrementalassignment3;

/**
 * @author Sunil Bhagat
 */

abstract class Rodent {
    Rodent(){
        System.out.println("This is Rodent class.");
    }
    abstract void eat();

    abstract void run();

    abstract void bite();
}

class Mouse extends Rodent {
    Mouse(){
        System.out.println("This is Mouse class.");
    }
    void eat() {
        System.out.println("Mouse is eating");
    }

    void run() {
        System.out.println("Mouse is running");
    }

    void bite() {
        System.out.println("Mouse is biting.");
    }
}

class Gerbil extends Rodent {
    Gerbil(){
        System.out.println("This is Gerbil class.");
    }
    void eat() {
        System.out.println("Gerbil is eating");
    }

    void run() {
        System.out.println("Gerbil is running");
    }

    void bite() {
        System.out.println("Gerbil is biting.");
    }
}

class Hamster extends Rodent {
    Hamster(){
        System.out.println("This is Hamster class.");
    }
    void eat() {
        System.out.println("Hamster is eating");
    }

    void run() {
        System.out.println("Hamster is running");
    }

    void bite() {
        System.out.println("Hamster is biting.");
    }
}

public class Rodents {
    public static void main(String[] args) {
        Rodent[] rodent = new Rodent[3];
        rodent[0] = new Mouse();
        rodent[1] = new Gerbil();
        rodent[2] = new Hamster();

        rodent[0].eat();
        rodent[0].run();
        rodent[0].bite();

        rodent[1].eat();
        rodent[1].run();
        rodent[1].bite();

        rodent[2].eat();
        rodent[2].run();
        rodent[2].bite();
    }
}
