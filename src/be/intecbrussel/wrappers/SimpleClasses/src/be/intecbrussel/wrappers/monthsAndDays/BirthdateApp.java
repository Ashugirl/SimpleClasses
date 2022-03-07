package be.intecbrussel.wrappers.monthsAndDays;

import java.time.*;

public class BirthdateApp {
    public static void main(String[] args) {
       LocalDate birthdate = LocalDate.of(1967, 11, 17);
       int dayOfYear = birthdate.getDayOfYear();
       int dayOfMonth = birthdate.getDayOfMonth();
       DayOfWeek dayOfWeek = birthdate.getDayOfWeek();
       boolean leapYear = birthdate.isLeapYear();

        System.out.println("Your birthdate: " + birthdate);
        System.out.println("\nThe day of the year was: " + dayOfYear);
        System.out.println("\nThe day of the month was: " + dayOfMonth);
        System.out.println("\nThe day of the week was: " + dayOfWeek);
        System.out.println("\nIt was a leap year. T/F? " + leapYear);

    }
}
