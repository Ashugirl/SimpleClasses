package be.intecbrussel.simpleclasses.examples.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Tijdsduur {
    public static void main(String[] args) {
        LocalDate nowDate = LocalDate.now();
        LocalDate birthdate = LocalDate.of(1967, 11,17);

        Period period = Period.between(birthdate, nowDate);
        System.out.println("Days since your birthday: " + Math.abs(period.getDays()));
        System.out.println("Months since your birthday: " + Math.abs(period.getMonths()));
        System.out.println("Years since your birthdate: " + Math.abs(period.getYears()));
        System.out.println();

        long days = ChronoUnit.DAYS.between(birthdate, nowDate);
        //days = Math.abs(days);
        System.out.println("The number of days since you were born: " + days);
        long months = ChronoUnit.MONTHS.between(birthdate, nowDate);
        //months = Math.abs(months);
        System.out.println("The number of months since you were born: " +months);
        long years = ChronoUnit.YEARS.between(birthdate, nowDate);
        //years = Math.abs(years);
        System.out.println("The Number of years since you were born: " +years);
        long weeks = ChronoUnit.WEEKS.between(birthdate, nowDate);
        //weeks = Math.abs(weeks);
        System.out.println("The Number of weeks since you were born: " + weeks);
    }
}
