package sunil.javaassignment3;

/**
 * @author Sunil Bhagat
 */

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Arrays;

/**
 * This method finds the median ping time of a URL.
 * @param url is the url of the website to ping.
 */

public class JavaAssignment3 {

    private static void pingUrl(String url) {
        float[] time= new float[5];
        int index =0;
        try{
            // running the ping command for 5 seconds.
            Process ping = Runtime.getRuntime().exec("ping -w 5 "+url);
            BufferedReader inputStream = new BufferedReader(
                    new InputStreamReader(ping.getInputStream()));

            String output = "";
            // reading output stream of the command
            while ((output = inputStream.readLine()) != null) {
                //System.out.println(output);
                Pattern word = Pattern.compile("time=");
                Matcher match = word.matcher(output);
                if(match.find()){
                    int i=match.end();
                    while(output.charAt(i)!=' '){i++;}
                    time[index]=Float.parseFloat(output.substring(match.end(),i));
                    index++;
                }
            }
        }catch(Exception e){
            System.out.println("Some error occurred.");
        }
        //check if we have received any packets.
        if(index!=0){
            Arrays.sort(time);
            System.out.println("Median time taken to ping = "+time[2]);
        }else{
            System.out.println("URL may be invalid or unreachable at the moment.");
        }
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String url = scan.next();
        pingUrl(url);
    }
}
