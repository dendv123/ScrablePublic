package scrable;

import java.util.regex.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;

public class Screen2 {

    private static File usernames;
     private  static FileWriter name;

    public static boolean setUsername(String userNameString) {
        Pattern p = Pattern.compile("^\\w{1,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }

    public void importUsername(String userNameString) {

        try {
            
            name = new FileWriter("src\\scrable\\usernames.txt",true);
            name.write(userNameString);
            name.close();
        } catch (FileNotFoundException a) {
            System.err.println("File doesn't exist");
        } catch (java.io.IOException e) {
            e.printStackTrace();
            System.out.println("here");
        }
        
    }

}
