package scrable;

import java.util.regex.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintStream;
public class Screen2
{
    private static File usernames = new File("src\\scarble\\usernames.txt");
    

    public static boolean setUsername(String userNameString)
    {
        Pattern p = Pattern.compile("^\\w{1,15}$");
        Matcher m = p.matcher(userNameString);
        return m.matches();
    }
   
    public static void importUsername(String userNameString)
    {
        System.out.println(usernames.exists());
        try
        {
        PrintStream name = new PrintStream("src\\scarble\\usernames.txt");
        name.println(userNameString); 
        } catch(FileNotFoundException a)
        {
            System.out.println("File doesn't exist");
        }

    }
    
}
