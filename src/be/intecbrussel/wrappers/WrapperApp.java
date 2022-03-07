package be.intecbrussel.wrappers;

import java.util.Scanner;

public class WrapperApp {
    public static void main(String[] args) {


        Scanner kbd = new Scanner(System.in);
        System.out.println("Please enter a value: ");
        String input = kbd.next();

        Integer stringValue = Integer.parseInt(input);

        stringValue += 5;

        System.out.println("The value of our converted string added with 5 is: " + stringValue);
        System.out.println("Integer number of bytes: " + Integer.BYTES);
        System.out.println("Integer number of bits: " + Integer.SIZE);

        }
    }

