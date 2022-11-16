package kata5p2.view;
import kata5p2.model.Mail;
import kata5p2.model.Histogram;
import java.util.*;


public class MailHistogramBuilder{
    
    public static Histogram<String> build(List<Mail> l) {
        Histogram<String> histogram = new Histogram<String>();
        for (Mail mail : l) {
            histogram.increment(mail.getDomain());
        }
        return histogram;
    }
}
