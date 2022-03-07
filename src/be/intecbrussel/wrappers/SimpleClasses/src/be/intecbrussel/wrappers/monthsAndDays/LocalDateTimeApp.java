package be.intecbrussel.wrappers.monthsAndDays;

import java.time.*;

public class LocalDateTimeApp {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalTime nowTime = LocalTime.now();
        LocalDateTime nowDateTime = LocalDateTime.now();

        LocalDate otherDate = LocalDate.of(2015,6,23);
        LocalTime otherTime = LocalTime.of(10, 25, 2);
        LocalDateTime otherDateTime = LocalDateTime.of(otherDate, otherTime);

        System.out.println(nowDate);
        System.out.println(nowTime);
        System.out.println(nowDateTime);
        System.out.println();
        System.out.println(otherDate);
        System.out.println(otherTime);
        System.out.println(otherDateTime);
    }
}
