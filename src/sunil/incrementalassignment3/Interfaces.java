package sunil.incrementalassignment3;

/**
 * @author Sunil Bhagat
 */

interface Interface1 {
    void method1a();
    void method1b();
}

interface  Interface2{
    void method2a();
    void method2b();
}

interface Interface3 {
    void method3a();
    void method3b();
}

interface Interface4 extends Interface1,Interface2, Interface3 {
    void method4();
}

class Concrete {
    public void methodcon() {}
}

class Class1 extends Concrete implements Interface4 {
    public void method1a() {
        System.out.println("method1a");
    }
    public void method1b() {
        System.out.println("method1b");
    }
    public void method2a() {
        System.out.println("method2a");
    }
    public void method2b() {
        System.out.println("method2b");
    }
    public void method3a() {
        System.out.println("method3a");
    }
    public void method3b() {
        System.out.println("method3b");
    }
    public void method4() {
        System.out.println("method4");
    }
}



public class Interfaces {
    public static void m1(Interface1 interface1) {
        interface1.method1a();
        interface1.method1b();

    }
    public static void m2(Interface2 interface2) {
        interface2.method2a();
        interface2.method2b();

    }
    public static void m3(Interface3 interface3) {
        interface3.method3a();
        interface3.method3b();

    }
    public static void m4(Interface4 interface4) {
        interface4.method4();
    }
    public static void main(String[] args) {
        Class1 c = new Class1();
        m1(c);
        m2(c);
        m3(c);
        m4(c);
    }
}
