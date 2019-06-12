package sunil.incrementalassignment7;

import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Sunil Bahgat
 */
public class Main {
    public static void main(String[] args) throws  IOException{
        String fileName = args[0];
        FileReader file1=null;
        try
        {
            file1 = new FileReader(fileName);
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }
        int letter;
        //creates  hashmap for storing letters.
        HashMap<Character,Integer> map = new HashMap<>();
        while ((letter=file1.read())!=-1) {
            System.out.print((char) letter);
            if(map.containsKey((char)letter)){
                int a = map.get((char)letter);
                map.put((char)letter,a+1);
            }else{
                if((char)letter!=' ' && (char)letter!='\n')
                map.put((char)letter,1);
            }
        }
        file1.close();
        System.out.println(map);
        String line;
        FileWriter file2 = new FileWriter("output.txt");
        //looping through every entry in hashmap and storing them in new file.
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            line = (entry.getKey() +" = "+entry.getValue()+'\n');
            file2.write(line);;
        }
        file2.close();
    }
}
