package LibraryManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Create sample library items
        LibraryItem book = new Book("B001", "Java Programming", "John Doe");
        LibraryItem magazine = new Magazine("M001", "Tech Weekly", "Jane Smith");
        LibraryItem dvd = new DVD("D001", "The Matrix", "Lana Wachowski");

        // List to store library items
        List<LibraryItem> items = new ArrayList<>();
        items.add(book);
        items.add(magazine);
        items.add(dvd);

        // Demonstrate polymorphism with LibraryItem reference
        processLibraryItems(items);

        // Demonstrating reserving items
        reserveItem(book);
        reserveItem(magazine);
        reserveItem(dvd);
    }

    // Method to process each library item and display its details and loan duration
    public static void processLibraryItems(List<LibraryItem> items) {
        for (LibraryItem item : items) {
            item.getItemDetails();
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days\n");
        }
    }

    // Method to reserve a library item (if it's reservable)
    public static void reserveItem(LibraryItem item) {
        if (item instanceof Reservable) {
            Reservable reservableItem = (Reservable) item;
            reservableItem.reserveItem();
        } else {
            System.out.println("This item cannot be reserved.");
        }
    }
}

