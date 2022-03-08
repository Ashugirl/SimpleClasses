package be.intecbrussel.simpleclasses.instants;

import java.time.Instant;

public class InstantApp {

    public static void main(String[] args) {

        Instant now = Instant.now();
        System.out.println("The current time is: " + now);
        Instant later = now.plusSeconds(7);
        later = later.plusMillis(5);
        later = later.plusNanos(3);

        System.out.println("The current time plus seven second, five milliseconds and 3 nanoseconds is: " + later);

        System.out.println("Epoch: " + Instant.EPOCH);
        System.out.println("Instant minimum: " + Instant.MIN);
        System.out.println("Instant maximum: " + Instant.MAX);
        System.out.println("Seconds since EPOCH: " + now.getEpochSecond());
        System.out.println("Nanoseconds since last second: " + now.getNano());

        Instant earlier = now.minusSeconds(20);
        System.out.println(earlier);

        Instant secsLater = now.plusSeconds(20);
        System.out.println(secsLater);

        System.out.println(now.isAfter(earlier));
        System.out.println(now.isBefore(secsLater));
    }
}