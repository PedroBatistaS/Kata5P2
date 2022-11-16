package kata5p2.main;
import kata5p2.view.MailListReaderBD;
import kata5p2.view.MailHistogramBuilder;
import kata5p2.view.HistogramDisplay;
import kata5p2.model.Mail;
import kata5p2.model.Histogram;

import java.util.*;


public class Kata5 {


   private static String filename = "email.txt";
   private static List<Mail> mailList = new ArrayList<Mail>();
   private static Histogram<String> histogram = new Histogram<String>();
   private static HistogramDisplay histoDisplay;
    
    public static void main(String[] args) {
        execute();
    }
    private static void execute() {
        input();
        process();
        output();
    }
    private static void input() {
        mailList = MailListReaderBD.read(filename);
    }
    private static void process() {
        histogram = MailHistogramBuilder.build(mailList);
    }

    private static void output() {
        new HistogramDisplay(histogram).execute();
    }
    
}
