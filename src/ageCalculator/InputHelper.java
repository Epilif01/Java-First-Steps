package ageCalculator;
import java.util.Scanner;

public class InputHelper {
    public static int getYear(Scanner scanner, String prompt) {
        int year = 0;
        while (year <= 0) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                year = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
            } else {
                System.out.println("Invalid year. Please enter a valid year.");
                scanner.nextLine(); // Discard invalid input
            }
        }
        return year;
    }

    public static int getMonth(Scanner scanner, String prompt) {
        int month = 0;
        while (month == 0) {
            System.out.print(prompt);
            String input = scanner.nextLine().trim();
            month = Conversions.monthToInt(input);
            if (month == 0) {
                System.out.println("Invalid month. Please enter a valid month.");
            }
        }
        return month;
    }

    public static int getDay(Scanner scanner, String prompt) {
        int day = 0;
        while (day <= 0 || day > 31) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                day = scanner.nextInt();
                scanner.nextLine(); // Clear buffer
                if (day <= 0 || day > 31) {
                    System.out.println("Invalid day. Please enter a valid day (1-31).");
                }
            } else {
                System.out.println("Invalid day. Please enter a valid day.");
                scanner.nextLine(); // Discard invalid input
            }
        }
        return day;
    }
    

    public static boolean validateDate(int month, int day) {
        if (day == 31 && (month == 4 || month == 6 || month == 9 || month == 11)) {
            return false;
        } else if (month == 2 && day > 29) {
            return false;
        }
        return true;
    }
}