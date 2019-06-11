package sunil.incrementalassignment3;

/**
 * @author Sunil Bhagat
 */

class A{
    A(){

    }
    class B{
        B(){
            //we need to define default constructor whenever we define a augmented constructor.
        }
        B(String data){
            System.out.println(data);
        }
    }
}
//To extend B t D first we must extend A to C.
class C extends A{
    class D extends B{
        D(){
            super("This is B.");
            System.out.println("This is D");
        }
    }
}

public class NestedClass{
    public static void main(String[] args){
        C c  = new C();
        C.D d = c.new D();
    }

}
