package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        System.out.print("How many tickets would you like? ");
        int ticket = scanner.nextInt();

        LocalDate reserved = getDate(date);

//        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
//        LocalDate reserved = LocalDate.parse(date, formatter);

        String tick = getTicket(ticket);

        name = getName(name);

        printResult(tick, reserved, name);
    }

    public static LocalDate getDate(String date) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        return LocalDate.parse(date, formatter);
    }

    public static String getName(String name) {
        int space = name.indexOf(" ");

        String firstName = name.substring(0, space);

        String lastName = name.substring(space + 1);

        name = lastName + ", " + firstName;
        return name;
    }

    public static String getTicket(int ticket) {
        String tick = "";
        if (ticket == 1) {
            tick = (ticket) + " ticket";
        } else {
            tick = (ticket) + " tickets";
        }
        return tick;
    }

    public static void printResult(String tick, LocalDate reserved, String name) {
        String result = tick + " reserved for " + reserved + " under " + name;
        System.out.println(result);
    }
}
