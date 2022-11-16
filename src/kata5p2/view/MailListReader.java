package kata5p2.view;
import kata5p2.model.Mail;
import java.io.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailListReader{
    
    public static List<Mail> read(String fileName) {
        BufferedReader br = null;
        List<Mail> mails = new ArrayList<Mail>();
        try {
            br = new BufferedReader(new FileReader(new File(fileName)));
            String linea;
            while ((linea = br.readLine()) != null) {
            if (!linea.contains("@")) continue;
            mails.add(new Mail(linea));
        }
        }
        catch(Exception e){
            e.printStackTrace();
        }
        return mails;
    }
}
