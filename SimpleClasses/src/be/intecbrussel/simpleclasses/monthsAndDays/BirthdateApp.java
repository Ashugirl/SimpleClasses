package be.intecbrussel.simpleclasses.monthsAndDays;

import java.time.*;
import java.util.Scanner;

public class BirthdateApp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        System.out.println("Enter the year you were born: ");
        int year = kbd.nextInt();
        System.out.println("Enter your birth month [1-12]: ");
        int month = kbd.nextInt();
        System.out.println("Enter the date of the month you were born: [1-31]: ");
        int dayOfMonth = kbd.nextInt();
        LocalDate birthdate = LocalDate.of(year, month, dayOfMonth);
        int dayOfYear = birthdate.getDayOfYear();
        dayOfMonth = birthdate.getDayOfMonth();
        DayOfWeek dayOfWeek = birthdate.getDayOfWeek();
        boolean leapYear = birthdate.isLeapYear();

        System.out.println("Your birthdate: " + birthdate);
        System.out.println("\nThe day of the year was: " + dayOfYear);
        System.out.println("\nThe day of the month was: " + dayOfMonth);
        System.out.println("\nThe day of the week was: " + dayOfWeek);
        System.out.println("\nIt was a leap year. T/F? " + leapYear);

        kbd.close();
    }

}
