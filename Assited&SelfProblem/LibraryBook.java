import java.util.ArrayList;
class Book {
    private String title;
    private String author;

    // Constructor
    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Method to display book details
    public void displayBook() {
        System.out.println("Title: " + title + ", Author: " + author);
    }
}

class Library {
    private String name;
    private ArrayList<Book> books;

    // Constructor
    public Library(String name) {
        this.name = name;
        this.books = new ArrayList<>();
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book.getTitle());
    }

    // Method to remove a book from the library
    public void removeBook(String title) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getTitle().equalsIgnoreCase(title)) {
                books.remove(i);
                System.out.println("Book removed: " + title);
                return;
            }
        }
        System.out.println("Book not found: " + title);
    }

    // Method to list all books in the library
    public void listBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in the library.");
        } else {
            System.out.println("Books in the library:");
            for (Book book : books) {
                book.displayBook();
            }
        }
    }
}
public class LibraryBook {
    public static void main(String[] args) {
        Library library = new Library("City Library");

        Book book1 = new Book("The God Of Small Things", "Arundhati Roy");
        Book book2 = new Book("Constitution Of India", "Dr. Bhim Rao Ambedkar");

        library.addBook(book1);
        library.addBook(book2);

        library.listBooks();

        library.removeBook("The God Of Small Things");
        library.listBooks();
    }
}

