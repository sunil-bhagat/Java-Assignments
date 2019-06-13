package sunil.incrementalassignment4;

/**
 * @author Sunil Bhagat.
 */

//creating three new exception classes.
class Exception1 extends Exception{
    Exception1(String error){
        super(error);
    }
}
class Exception2 extends Exception{
    Exception2(String error){
        super(error);
    }

}
class Exception3 extends Exception{
    Exception3(String error){
        super(error);
    }
}

public class Exceptions {
    /**
     * this method throws three user defined and NullPointer Exsception.
     * @param num
     */
    static void throwException(int num){
        try{
            if(num==1){
                throw new Exception1("Exception1");
            }else if(num==2){
                throw new Exception2("Exception2");
            }else if(num==3){
                throw new Exception3("Exception3");
            }else{
                throw new  NullPointerException("NullPointerException");
            }
        }catch (Exception1|Exception2|Exception3|NullPointerException e){
            System.out.println("Caught "+e.getMessage());
        } finally {
            System.out.println("finally block executed.");
        }
    }
    public static void main(String[] args){
        throwException(1);
        throwException(2);
        throwException(3);
        throwException(4);
    }
}
