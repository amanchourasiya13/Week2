import java.util.Date;
// Subclass: ShippedOrder (inherits from Order)
public class ShippedOrder extends Order {
    String trackingNumber;

    // Constructor
    public ShippedOrder(String orderId, Date orderDate, String trackingNumber) {
        // Call the superclass (Order) constructor
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overriding the getOrderStatus() method for shipped orders
    //@Override
    public String getOrderStatus() {
        return "Order Shipped";
    }

    // Method to display shipping details
    public void displayShippingDetails() {
        System.out.println("Tracking Number: " + trackingNumber);
    }
}