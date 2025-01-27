package LibraryManagementSystem;

// Abstract LibraryItem Class
public abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    // Constructor to initialize common item details
    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    // Getter methods (Encapsulation)
    public String getItemId() {
        return itemId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item ID: " + itemId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
    }

    // Abstract method to get loan duration
    public abstract int getLoanDuration();
}

