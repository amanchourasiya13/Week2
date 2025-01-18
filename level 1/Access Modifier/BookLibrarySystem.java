// Parent class: Book
 class Book {
    // Instance variables
    public String ISBN;       // Public: accessible from anywhere
    protected String title;    // Protected: accessible within the class, subclasses, and classes in the same package
    private String author;     // Private: accessible only within the Book class

    // Constructor to initialize book details
    public Book(String ISBN, String title, String author) {
        this.ISBN = ISBN;
        this.title = title;
        this.author = author;
    }

    // Setter method to set the author's name
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter method to get the author's name
    public String getAuthor() {
        return this.author;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }
}

// Subclass: EBook
class EBook extends Book {

    // Constructor to initialize eBook details
    public EBook(String ISBN, String title, String author) {
        super(ISBN, title, author); // Calling parent class constructor
    }

    // Method to display EBook details, showing access to ISBN and title
    public void displayEBookDetails() {
        System.out.println("EBook Details:");
        // Accessing the public 'ISBN' and protected 'title' from the parent class
        System.out.println("ISBN: " + ISBN);
        System.out.println("Title: " + title);
    }
}

// Main class to test the functionality
public class BookLibrarySystem {
    public static void main(String[] args) {
        // Creating an instance of the Book class
        Book book = new Book("978-3-16-148410-0", "Java Programming", "James Gosling");
        
        // Displaying book details
        System.out.println("Book Details:");
        book.displayBookDetails();
        
        // Modifying author name using the setter method
        book.setAuthor("Herbert Schildt");
        System.out.println("\nUpdated Book Details:");
        book.displayBookDetails();
        
        // Creating an instance of EBook class
        EBook eBook = new EBook("978-0-13-468599-1", "Effective Java", "Joshua Bloch");
        
        // Displaying eBook details
        System.out.println("\nEBook Details:");
        eBook.displayEBookDetails();
        
        // Attempting to directly access private 'author' will result in a compile-time error
        // System.out.println("Author: " + eBook.author); // Error: 'author' has private access
    }
}
