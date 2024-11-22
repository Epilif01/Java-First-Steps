package library;

class Book {
    private String title;
    private String author;
    private boolean isBorrowed;

    public Book(String title, String author){
        this.title = title;
        this.author = author;
    }

    public String getTitle(){
        return title;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public void borrow(){
        if (!isBorrowed){
            isBorrowed = true;
        } else{
            System.out.println("Can't borrow a book that is already borrowed!");
        }
    }

    public void returnBook(){
        if (isBorrowed){
            isBorrowed = false;
        } else {
            System.out.println("Can't return a book that was not borrowed!");
        }
    }

    public boolean isAvailable(){
        return !isBorrowed;
    }

}