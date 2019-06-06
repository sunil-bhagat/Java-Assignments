package sunil.javassignment1;

/*
 * @author Sunil Bhagat
 */

import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class JavaAssignment1 {
    /*
     * This method search files recursively in directory and its sub-directories
     * @param expression  is the regex pattern to be matched with file names.
     * @param currentDir  is the current directory we're searching in.
     *
     */


    static void getFiles(String expression,String currentDir){
        File directory = new File(currentDir);
        if(directory.exists()){
            //Store the list of all files in the current directory.
            File files[] = directory.listFiles();
            //check if the the user entered valid regular expression.
            try{
                Pattern.compile(expression);
            }catch(PatternSyntaxException e){
                System.out.println("Invalid Pattern.");
                return;
            }
            for(int i=0;i<files.length;i++){
                if(files[i].isFile()) {
                    if (Pattern.matches(expression, files[i].getName())) {
                        System.out.println(files[i].getName() + " " + files[i].getAbsolutePath());
                    }
                }else if(files[i].isDirectory()){
                    //check for files in sub-directories.
                    getFiles(expression,files[i].getAbsolutePath());
                }
            }
        }else{
            System.out.println("Home directory doesn't exist.");
            return;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String exit = "-1";
        System.out.println("Enter expression or -1 to exit.");
        String expression = scan.next();
        // Run until user enters -1
        while(!Pattern.matches(exit,expression)){
            getFiles(expression,"/home");
            System.out.println("Enter expression or -1 to exit.");
            expression = scan.next();
        }

    }
}
