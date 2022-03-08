package be.intecbrussel.simpleclasses.examples.datetime;

import java.time.*;
import java.time.temporal.*;

public class DurationApp {
    public static void main(String[] args) {
        Instant now = Instant.now();
        Instant later = now.plusSeconds(500)
        .plusMillis(2125698).plusNanos(456398);

        Duration duration = Duration.between(now, later);
        System.out.println("Seconds between now and given time: " + duration.getSeconds());

        long milliseconds = ChronoUnit.MILLIS.between(now,later);
        System.out.println("Milliseconds between now and given time:" + milliseconds);

        LocalDate nowDate = LocalDate.now();
        LocalDate thenDate = LocalDate.of(1980, 2, 15);

        Period period = Period.between(nowDate, thenDate);
        System.out.println("Period between now and date given (day/month): " + period.getDays());
        long days = ChronoUnit.DAYS.between(nowDate, thenDate);
        System.out.println("Days between now and date given (total days): " + days);


    }
}
