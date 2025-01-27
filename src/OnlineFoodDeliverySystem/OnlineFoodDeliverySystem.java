package OnlineFoodDeliverySystem;

import java.util.ArrayList;
import java.util.List;

public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Create some food items
        FoodItem vegItem1 = new VegItem("Veg Pizza", 12.99, 2);
        FoodItem nonVegItem1 = new NonVegItem("Chicken Burger", 8.99, 3);

        // Apply discounts
        ((VegItem)vegItem1).applyDiscount(10);  // 10% discount on Veg Pizza
        ((NonVegItem)nonVegItem1).applyDiscount(5);  // 5% discount on Chicken Burger

        // List to store food items
        List<FoodItem> orderItems = new ArrayList<>();
        orderItems.add(vegItem1);
        orderItems.add(nonVegItem1);

        // Process the order
        processOrder(orderItems);
    }

    // Method to process the order and calculate total price for all items
    public static void processOrder(List<FoodItem> orderItems) {
        double totalOrderPrice = 0;
        for (FoodItem item : orderItems) {
            item.getItemDetails();  // Get the item details
            // Check if the item is Discountable and if so, apply the discount details
            if (item instanceof Discountable) {
                ((Discountable) item).getDiscountDetails();
            }
            // Calculate and display the total price for this item
            double totalPrice = item.calculateTotalPrice();
            System.out.println("Total Price: $" + totalPrice + "\n");
            totalOrderPrice += totalPrice;
        }
        System.out.println("Total Order Price: $" + totalOrderPrice);
    }

}
