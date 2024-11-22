package library;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
        Book existingBook = searchBook(book.getTitle());
        if(existingBook == null || existingBook.getAuthor().equals(book.getAuthor())){
            books.add(book);
        }else{
            System.out.println("Book already exists.");
        }
        showBooks();
    }

    public Book searchBook(String title){
        for(Book book : books){
                if (book.getTitle().equals(title)){
                    return book;
                }
            }
        return null;
    }

    public void showBooks() {
        System.out.println("Updated Book List:");
        for (Book book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() + 
                " - " + (book.isAvailable() ? "Available" : "Borrowed"));
        }
    }

    public void borrowBook(String title){
        Book book = searchBook(title);
        if (book != null){
            book.borrow();
        }
        else{
            System.out.println("Book does not exist.");
        }
        showBooks();
    }

    public void returnBook(String title){
        Book book = searchBook(title);
        if (book != null){
            book.returnBook();
        } else {
            System.out.println("Book does not exist.");
        }
        showBooks();
    }

}
