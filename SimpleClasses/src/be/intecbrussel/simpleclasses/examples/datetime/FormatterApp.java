package be.intecbrussel.simpleclasses.examples.datetime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FormatterApp {
    public static void main(String[] args) {
        DateTimeFormatter myFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        DateTimeFormatter isoFormatter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;

        //parsing
        LocalDateTime dt = LocalDateTime.parse("03/08/1998 13:45:23", myFormatter);

        //formatting
        System.out.println(myFormatter.format(dt));
        System.out.println(isoFormatter.format(dt));

        LocalDateTime now = LocalDateTime.now();
       // System.out.println("%1$td/%1$tm/%1$tY %1$tH:%1$tM:%1$ts", now);
    }
}
