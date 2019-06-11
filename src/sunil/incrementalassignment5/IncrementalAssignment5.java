package sunil.incrementalassignment5;
/**
 * @author Sunil Bhagat
 */

import java.util.Scanner;
import java.util.regex.Pattern;

public class IncrementalAssignment5 {
    static void checkexpression(String sentence){
        //matching the sentence to see if it begins with capital letter and ends with .
        boolean check = Pattern.matches("[A-Z].*\\.",sentence);
        if(check){
            System.out.println("Correct Format.");
        }else{
            System.out.println("Incorrect Format.");
        }
    }
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String sentence = scan.nextLine();
        checkexpression(sentence);
    }
}
