class CartItem {
    String itemName;
    double price;
    int quantity;

    // Constructor to initialize CartItem
    public CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to get the total cost of the item
    public double getTotalCost() {
        return price * quantity;
    }

    // Method to display item details
    public void displayItem() {
        System.out.println(itemName + " (Price: Rs" + price + ", Quantity: " + quantity + ")");
    }
}

class ShoppingCart {
    private double totalCost;
    private CartItem item1, item2, item3, item4, item5;  // Five possible items

    // Constructor to initialize the shopping cart
    public ShoppingCart() {
        totalCost = 0.0;
    }

    // Add item to the cart and update the total cost
    public void addItem(CartItem item) {
        if (item1 == null) {
            item1 = item;
        } else if (item2 == null) {
            item2 = item;
        } else if (item3 == null) {
            item3 = item;
        } else if (item4 == null) {
            item4 = item;
        } else if (item5 == null) {
            item5 = item;
        } else {
            System.out.println("Cart is full! Cannot add more items.");
            return;
        }
        totalCost += item.getTotalCost();  // Update the total cost
        System.out.println(item.itemName + " added to the cart.");
    }

    // Remove item from the cart and update the total cost
    public void removeItem(CartItem item) {
        if (item == item1) {
            totalCost -= item1.getTotalCost();
            item1 = null;
        } else if (item == item2) {
            totalCost -= item2.getTotalCost();
            item2 = null;
        } else if (item == item3) {
            totalCost -= item3.getTotalCost();
            item3 = null;
        } else if (item == item4) {
            totalCost -= item4.getTotalCost();
            item4 = null;
        } else if (item == item5) {
            totalCost -= item5.getTotalCost();
            item5 = null;
        } else {
            System.out.println(item.itemName + " not found in the cart.");
            return;
        }
        System.out.println(item.itemName + " removed from the cart.");
    }

    // Display all items in the cart
    public void displayAllItems() {
        if (item1 != null) {
            item1.displayItem();
        }
        if (item2 != null) {
            item2.displayItem();
        }
        if (item3 != null) {
            item3.displayItem();
        }
        if (item4 != null) {
            item4.displayItem();
        }
        if (item5 != null) {
            item5.displayItem();
        }
    }

    // Display the total cost of the cart
    public void displayTotalCost() {
        System.out.println("Total Cost of the Cart: Rs" + totalCost);
    }
}

public class ShoppingCart3{
    public static void main(String[] args) {
        // Create a shopping cart
        ShoppingCart cart = new ShoppingCart();

        // Add items to the cart
        CartItem laptop = new CartItem("Laptop", 1200.00, 1);
        CartItem headphones = new CartItem("Headphones", 100.00, 2);
        CartItem mouse = new CartItem("Mouse", 25.00, 1);

        cart.addItem(laptop);
        cart.addItem(headphones);
        cart.addItem(mouse);

        // Display all items in the cart
        cart.displayAllItems();

        // Display total cost
        cart.displayTotalCost();

        // Remove an item
        cart.removeItem(headphones);

        // Display total cost after removal
       cart.displayTotalCost();

        // Display all items after removal
       System.out.println("Remain items in cart:"); 
       cart.displayAllItems();
    }
}
