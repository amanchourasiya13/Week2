package LibraryManagementSystem;

// DVD Class
public class DVD extends LibraryItem implements Reservable {
    private static final int LOAN_DURATION = 3; // 3 days loan period for DVDs
    private boolean isAvailable;

    // Constructor for DVD
    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.isAvailable = true; // DVD is available by default
    }

    // Implement getLoanDuration for DVD
    @Override
    public int getLoanDuration() {
        return LOAN_DURATION;
    }

    // Implement reserveItem method from Reservable interface
    @Override
    public void reserveItem() {
        if (isAvailable) {
            System.out.println("DVD reserved: " + getTitle());
            isAvailable = false; // DVD is now reserved
        } else {
            System.out.println("DVD is already reserved.");
        }
    }

    // Implement checkAvailability method from Reservable interface
    @Override
    public boolean checkAvailability() {
        return isAvailable;
    }
}

