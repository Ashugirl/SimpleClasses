package be.intecbrussel.simpleclasses.examples.datetime;

import java.time.*;

public class ZoneDateTimeApp {
    public static void main(String[] args) {
        ZoneId londonZone = ZoneId.of("Europe/London");
        ZoneId sydneyZone = ZoneId.of("Australia/Sydney");
        ZoneId edmontonZone = ZoneId.of("America/Edmonton");


        ZonedDateTime nowHere = ZonedDateTime.now();
        ZonedDateTime nowLondon = ZonedDateTime.now(londonZone);
        ZonedDateTime nowSydney = ZonedDateTime.now(sydneyZone);
        ZonedDateTime nowEdmonton =  ZonedDateTime.now(edmontonZone);

        System.out.println("Local time: " + nowHere);
        System.out.println("UK time: "+ nowLondon);
        System.out.println("Time in Sydney Australia: " + nowSydney);
        System.out.println("Time in Edmonton Alberta Canada: " + nowEdmonton);

    }
}
