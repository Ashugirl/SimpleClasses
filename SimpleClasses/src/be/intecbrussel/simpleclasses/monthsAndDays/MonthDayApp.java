package be.intecbrussel.simpleclasses.monthsAndDays;

import java.time.DayOfWeek;
import java.time.Month;
import java.util.Scanner;

public class MonthDayApp {
    public static void main(String[] args) {
        for (Month m : Month.values()) {
            System.out.printf("%s : [%d, %d] %n", m, m.minLength(), m.maxLength());
        }
        for (DayOfWeek d : DayOfWeek.values()) {
            System.out.printf("%s %n", d);
        }

        Scanner kbd = new Scanner(System.in);

        int month;
        do{
            System.out.println("Please enter a month [1-12]: ");
            month = kbd.nextInt();
        } while (month < 1 || month > 12);

        System.out.println("Please enter the number of months you'd like to add: ");
        int extraMonths = kbd.nextInt();

        Month thisMonth = Month.of(month);
        Month laterMonth = thisMonth.plus(extraMonths);

        System.out.println("The current month is: " + thisMonth);
        System.out.printf("If we add %d months it will be %s. ",  extraMonths, laterMonth);

        kbd.close();
    }

}