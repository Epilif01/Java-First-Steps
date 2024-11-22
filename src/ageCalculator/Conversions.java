package ageCalculator;
import java.time.LocalDate;

public class Conversions {
    public static int age(int birthYear, int birthMonth, int birthDay) {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(birthYear, birthMonth, birthDay);

        // Calculate age
        int age = today.getYear() - birthDate.getYear();
        if (today.isBefore(birthDate.withYear(today.getYear()))) {
            age--; // Adjust age if birthday hasn't occurred this year
        }
        return age;
    }

    public static int monthToInt(String str) {
        str = str.trim().toLowerCase(); // Normalize input

        // Check if input is a valid number
        try {
            int month = Integer.parseInt(str);
            if (month >= 1 && month <= 12) {
                return month;
            }
        } catch (NumberFormatException e) {
            // Fall through to string matching
        }

        // Map month names to numbers
        switch (str) {
            case "january": return 1;
            case "february": return 2;
            case "march": return 3;
            case "april": return 4;
            case "may": return 5;
            case "june": return 6;
            case "july": return 7;
            case "august": return 8;
            case "september": return 9;
            case "october": return 10;
            case "november": return 11;
            case "december": return 12;
            default: return 0; // Invalid input
        }
    }
}