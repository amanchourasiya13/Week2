package LibraryManagementSystem;

// Book Class
public class Book extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 14; // 14 days loan period for books
    private boolean isAvailable;

    // Constructor for Book
    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Book is available by default
    }

    // Implement getLoanDuration for Book
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implement reserveItem method from Reservable interface
    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Book reserved: " + getTitle());
            isAvailable = false; // Book is now reserved
        } else {
            System.out.println("Book is already reserved.");
        }
    }

    // Implement checkAvailability method from Reservable interface
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

