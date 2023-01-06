package scrable;

import java.io.BufferedReader;
import java.util.regex.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ScreenInsertUsernamesMethods {

    private static File usernames;
    private static FileWriter name;
    private static FileReader read;
    
    public static boolean setUsername(String userNameString) {
        Pattern p = Pattern.compile("^\\w{1,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
    private boolean check_if_exists(String username)
    {
        try {
            read = new FileReader("src\\scrable\\usernames.txt");
            BufferedReader bf = new BufferedReader(read);
            String str;
            while ((str = bf.readLine()) != null)
            {
                if (str.equals(username)) return true;
            }
        } catch (FileNotFoundException ex) {
            System.err.println("File doesn't exist");
        } catch (IOException e) {
            
        }
        return false;
    }
    public void importUsername(String userNameString) {
        for (String username: userNameString.split("\n"))
        {
            if (check_if_exists(username)) continue;
            try {

                name = new FileWriter("src\\scrable\\usernames.txt",true);
                name.write(username + "\n");
                name.close();
            } catch (FileNotFoundException a) {
                System.err.println("File doesn't exist");
            } catch (java.io.IOException e) {

            }
        }
    }

}
