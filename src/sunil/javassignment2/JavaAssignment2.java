package sunil.javassignment2;

/**
 * @author Sunil Bhagat
 */

import java.util.Scanner;

public class JavaAssignment2 {

    /**
     * This method checks if the given string contains all the alphabets or not.
     * @param input is the string entered by user.
     * Time Complexity: O(n);
     * Space Complexity: O(1);
     */

    static boolean checkAlphabets(String input){
        //frequency array to store the frequency of letters.
        int[] freqArray = new int[26];
        int count=0;
        for(char letter:input.toCharArray()){
            if( letter!= ' ' && freqArray[letter-65]!=1){
                freqArray[letter-65]=1;
                count++;
            }
        }
        if(count==26){
            return true;
        }else{
            return false;
        }

    }

    public static void  main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the String.");
        String input = scan.nextLine();
        boolean  check = checkAlphabets(input.toUpperCase());
        if(check){
            System.out.println("Input string contains all the alphabets.");
        }else{
            System.out.println("Input string doesn't contains all the alphabets.");
        }
    }
}
