package be.intecbrussel.wrappers.instants;

import java.time.Instant;

public class InstantApp {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("The current time is: " + now);
        Instant later = now.plusSeconds(7);
        later = later.plusMillis(5);
        later = later.plusNanos(3);

        System.out.println("The current time plus seven second, five milliseconds and 3 nanoseconds is: " + later);

        System.out.println(Instant.EPOCH);
        System.out.println(now.getEpochSecond());
    }
}
