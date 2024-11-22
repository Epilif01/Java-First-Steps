package zodiacSigns;
import java.util.Scanner;

import ageCalculator.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Zodiac Sign Calculator!");
        
        Scanner scanner = new Scanner(System.in);
        
        byte userChoice = 1;
        int birthMonth = 0;
        int birthDay = 0;
        while (true) {
            boolean validDate = false;
            System.out.println("1. Calculate Zodiac Sign");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            userChoice = scanner.nextByte();
            scanner.nextLine(); // Clear buffer
            if (userChoice == 0) {
                break;
            }else if (userChoice != 1) {
                System.out.println("Invalid choice. Please enter a valid choice.");
                continue;
            }
            System.out.println("This program will tell you your zodiac sign based on your birthdate.");
            while (!validDate) {
                birthMonth = InputHelper.getMonth(scanner, "Enter your birth month (e.g., '3' or 'March'): ");
                birthDay = InputHelper.getDay(scanner, "Enter your birth day: ");
                validDate = InputHelper.validateDate(birthMonth, birthDay);
                if (!validDate) {
                    System.out.println("Invalid date. Please enter a valid date.");
                }
            }
        }


        scanner.close();
    }
}