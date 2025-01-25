import java.util.Date;
public class OrderManagement {
    public static void main(String[] args) {
        // Create an Order object
        Order order = new Order("ORD001", new Date());
        order.displayOrderDetails();
        System.out.println("Status: " + order.getOrderStatus());

        // Create a ShippedOrder object
        ShippedOrder shippedOrder = new ShippedOrder("ORD002", new Date(), "TRK12345");
        shippedOrder.displayOrderDetails();
        shippedOrder.displayShippingDetails();
        System.out.println("Status: " + shippedOrder.getOrderStatus());

        // Create a DeliveredOrder object
        DeliveredOrder deliveredOrder = new DeliveredOrder("ORD003", new Date(), "TRK67890", new Date());
        deliveredOrder.displayOrderDetails();
        deliveredOrder.displayShippingDetails();
        deliveredOrder.displayDeliveryDetails();
        System.out.println("Status: " + deliveredOrder.getOrderStatus());
    }
}
