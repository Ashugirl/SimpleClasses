package be.intecbrussel.simpleclasses.examples.datetime;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class ZoneDateTimeEx5 {
    public static void main(String[] args) {


        //ZoneId brusselsZone = ZoneId.of("Europe/Brussels");
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId adelaideZone = ZoneId.of("Australia/Adelaide");
        //ZoneOffset timezone = ZoneOffset.ofHours(-4);
        ZoneId utc4Zone = ZoneId.of("UTC-4");

        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowAdelaide = ZonedDateTime.now(adelaideZone);
        ZonedDateTime nowUtc4 = ZonedDateTime.now(utc4Zone);

        System.out.println(nowHere);
        System.out.println(nowLondon);
        System.out.println(nowSydney);
        System.out.println(nowAdelaide);
        System.out.println("UTC -4 " + utc4Zone);
    }
}