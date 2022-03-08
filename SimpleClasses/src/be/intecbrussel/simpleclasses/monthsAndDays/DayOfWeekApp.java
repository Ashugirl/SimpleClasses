package be.intecbrussel.simpleclasses.monthsAndDays;

import java.time.DayOfWeek;
import java.util.Scanner;

public class DayOfWeekApp {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int day;
        do{
        System.out.println("Please enter a day of the week from 1(mon) - 7(sun): ");
         day = kbd.nextInt();
        } while (day < 1 || day > 7);


        System.out.println("Please enter a number of days you'd like to add: ");
        int extra = kbd.nextInt();

        DayOfWeek today = DayOfWeek.of(day);
        DayOfWeek futureDay = today.plus(extra);

        System.out.println("The day you have chosen is: " + today);
        System.out.println("After adding " + extra + " days it is: " + futureDay);



        kbd.close();

    }
}
