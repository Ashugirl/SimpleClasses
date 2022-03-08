package be.intecbrussel.simpleclasses.monthsAndDays;
import java.time.*;

public class TimeZone {
    public static void main(String[] args) {

        ZoneId zoneId = ZoneId.of("Europe/Brussels");
        System.out.println("Zone ID: " + zoneId);

        ZoneId systemZoneId = ZoneId.systemDefault();
        System.out.println("System zone ID: " + systemZoneId);

        ZoneOffset timeZone = ZoneOffset.ofHours(2);
        System.out.println("Time zone: " + timeZone);
    }
}
