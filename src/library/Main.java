package library;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Library myLibrary = new Library();
        System.out.println("Library Created. Type any key to continue...");
        scanner.nextLine();
        
        myLibrary.addBook(new Book("Java Intro", "GPT"));
        pause(scanner);
        myLibrary.addBook(new Book("Fiction", "Tigas"));
        pause(scanner);
        myLibrary.addBook(new Book("Sol", "Chuva"));
        pause(scanner);
        myLibrary.addBook(new Book("Java Intro", "GPT")); //will not be added because it already exists.
        pause(scanner);

        myLibrary.borrowBook("Sol");
        pause(scanner);
        myLibrary.borrowBook("Fiction");
        pause(scanner);
        myLibrary.borrowBook("Sol");
        pause(scanner);
        myLibrary.borrowBook("Salazar");
        pause(scanner);
        myLibrary.returnBook("Sol");
        pause(scanner);
        myLibrary.returnBook("Fiction");

        scanner.close();


    }
    private static void pause(Scanner scanner){
        System.out.println("Type any key to continue...");
        scanner.nextLine();
    }
}
