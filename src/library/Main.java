package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library myLibrary = new Library();
        System.out.println("Library Created. Type any key to continue...");
        scanner.nextLine();
        myLibrary.addBook(new Book("Java Intro", "GPT"));
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.addBook(new Book("Fiction", "Tigas"));
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.addBook(new Book("Sol", "Chuva"));
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.addBook(new Book("Java Intro", "GPT")); //will not be added because it already exists.
        System.out.println("Type any key to continue...");
        scanner.nextLine();

        myLibrary.borrowBook("Sol");
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.borrowBook("Fiction");
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.borrowBook("Sol");
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.borrowBook("Salazar");
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.returnBook("Sol");
        System.out.println("Type any key to continue...");
        scanner.nextLine();
        myLibrary.returnBook("Fiction");

        scanner.close();


    }
}
