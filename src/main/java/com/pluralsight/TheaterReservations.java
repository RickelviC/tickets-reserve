package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String tick = "";

        System.out.print("Please enter your name: ");
        String name = scanner.nextLine().trim();

        int space = name.indexOf(" ");

        String firstName = name.substring(0,space);

        String lastName = name.substring(space + 1);

        name = lastName + ", " + firstName;


        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        String date = scanner.nextLine();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate reserved = LocalDate.parse(date, formatter);

        System.out.print("How many tickets would you like? ");
        int ticket = scanner.nextInt();

        if (ticket == 1){
            tick = (ticket) + " ticket";
        }else {
            tick = (ticket) + " tickets";
        }

        String result = tick + " reserved for " + reserved + " under " + name;
        System.out.println(result);
    }
}
