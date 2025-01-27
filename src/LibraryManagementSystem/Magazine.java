package LibraryManagementSystem;

// Magazine Class
public class Magazine extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 7; // 7 days loan period for magazines
    private boolean isAvailable;

    // Constructor for Magazine
    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // Magazine is available by default
    }

    // Implement getLoanDuration for Magazine
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implement reserveItem method from Reservable interface
    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("Magazine reserved: " + getTitle());
            isAvailable = false; // Magazine is now reserved
        } else {
            System.out.println("Magazine is already reserved.");
        }
    }

    // Implement checkAvailability method from Reservable interface
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

