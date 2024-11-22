package library;

import java.util.ArrayList;
import java.util.List;

class Library {
    private List<Book> books = new ArrayList<>();
    
    public void addBook(Book book){
        if(searchBook(book.getTitle()) == null || searchBook(book.getTitle()).getAuthor() != book.getAuthor()){
            books.add(book);
        }else{
            System.out.println("Book already exists.");
        }
        showBooks();
    }

    public Book searchBook(String title){
        for(Book book : books){
                if (book.getTitle() == title){
                    return book;
                }
            }
        return null;
    }

    public void showBooks(){
        System.out.println("Update Book List:");
        for(Book book : books){
            System.out.println(book.getTitle() + " by " + book.getAuthor());
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
    }

    public void returnBook(String title){
        Book book = searchBook(title);
        if (book != null){
            book.returnBook();
        }
        System.out.println("Book does not exist.");
    }

}
