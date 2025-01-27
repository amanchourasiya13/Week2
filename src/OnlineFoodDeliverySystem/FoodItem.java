package OnlineFoodDeliverySystem;
// Abstract FoodItem Class
public abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    // Constructor to initialize food item details
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods (Encapsulation)
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Setter methods (Encapsulation)
    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    // Concrete method to get item details
    public void getItemDetails() {
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per item: $" + price);
        System.out.println("Quantity: " + quantity);
    }

    // Abstract method to calculate total price (to be implemented by subclasses)
    public abstract double calculateTotalPrice();
}

