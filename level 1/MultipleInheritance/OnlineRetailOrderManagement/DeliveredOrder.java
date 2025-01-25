import java.util.Date;
// Subclass: DeliveredOrder (inherits from ShippedOrder)
public class DeliveredOrder extends ShippedOrder {
    Date deliveryDate;

    // Constructor
    public DeliveredOrder(String orderId, Date orderDate, String trackingNumber, Date deliveryDate) {
        // Call the superclass (ShippedOrder) constructor
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overriding the getOrderStatus() method for delivered orders
    //@Override
    public String getOrderStatus() {
        return "Order Delivered";
    }

    // Method to display delivery details
    public void displayDeliveryDetails() {
        System.out.println("Delivery Date: " + deliveryDate);
    }
}