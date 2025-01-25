import java.util.Date;
// Base Class: Order
public class Order {
    String orderId;
    Date orderDate; // we take Date type so we have to  import it in all classes seperately.

    // Constructor
    public Order(String orderId, Date orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method to get the order status (Base class returns 'Created' as the initial status)
    public String getOrderStatus() {
        return "Order Created";
    }

    // Method to display order details
    public void displayOrderDetails() {
        System.out.println("\nOrder ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}
