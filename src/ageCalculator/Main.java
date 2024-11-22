package ageCalculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Boolean validAge = false;

        while(!validAge){
            int birthYear = InputHelper.getYear(scanner, "Enter your birth year: ");
            int birthMonth = InputHelper.getMonth(scanner, "Enter your birth month (e.g., '3' or 'March'): ");
            int birthDay = InputHelper.getDay(scanner, "Enter your birth day: ");
            validAge = InputHelper.validateDate(birthMonth, birthDay);
            if (validAge) {
                int age = Conversions.age(birthYear, birthMonth, birthDay);
                System.out.println("You are " + age + " years old!");
            } else {
                System.out.println("Invalid date. Please enter a valid date.");
            }
        }


            

        scanner.close(); // Okay to close since we're done with input
    }
}