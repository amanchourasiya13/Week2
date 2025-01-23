import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Product class (Represents a product in the system)
class Product {
    private String productId;
    private String name;
    private double price;
    private String category;

    // Constructor
    public Product(String productId, String name, double price, String category) {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.category = category;
    }

    // Method to get product information
    public String getProductInfo() {
        return "Product ID: " + productId + ", Name: " + name + ", Price: $" + price + ", Category: " + category;
    }

    // Getters
    public String getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }
}

// Order class (Represents an order placed by a customer)
class Order {
    private String orderId;
    private Date orderDate;
    private String status;
    private Customer customer; // Reference to the customer who placed the order
    private List<Product> products; // Aggregation: Order contains multiple Products

    // Constructor
    public Order(String orderId, Date orderDate, String status, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.status = status;
        this.customer = customer;
        this.products = new ArrayList<>();
    }

    // Add product to the order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Remove product from the order
    public void removeProduct(Product product) {
        products.remove(product);
    }

    // Calculate total price of the order
    public double calculateTotalPrice() {
        double total = 0;
        for (Product product : products) {
            total += product.getPrice();
        }
        return total;
    }

    // Getters
    public String getOrderId() {
        return orderId;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public String getStatus() {
        return status;
    }

    public Customer getCustomer() {
        return customer;
    }

    public List<Product> getProducts() {
        return products;
    }
}

// Customer class (Represents a customer in the system)
class Customer {
    private String customerId;
    private String name;
    private String email;
    private List<Order> orders; // Association: Customer places multiple Orders

    // Constructor
    public Customer(String customerId, String name, String email) {
        this.customerId = customerId;
        this.name = name;
        this.email = email;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public void placeOrder(Order order) {
        orders.add(order);
    }

    // View all orders placed by the customer
    public List<Order> viewOrders() {
        return orders;
    }

    // Getters
    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Main class to test the code
public class EcommerceSystem {
    public static void main(String[] args) {
        // Create some products
        Product product1 = new Product("P001", "Laptop", 1000.00, "Electronics");
        Product product2 = new Product("P002", "Smartphone", 600.00, "Electronics");
        Product product3 = new Product("P003", "Headphones", 100.00, "Accessories");

        // Create a customer
        Customer customer = new Customer("C001", "John Doe", "john@example.com");

        // Create an order for the customer
        Order order1 = new Order("O001", new Date(), "Processing", customer);

        // Add products to the order
        order1.addProduct(product1);
        order1.addProduct(product2);

        // Place the order
        customer.placeOrder(order1);

        // Add another order for the customer
        Order order2 = new Order("O002", new Date(), "Shipped", customer);
        order2.addProduct(product3);
        customer.placeOrder(order2);

        // View all orders placed by the customer
        System.out.println("Orders placed by " + customer.getName() + " (Email: " + customer.getEmail() + "):");
        for (Order order : customer.viewOrders()) {
            System.out.println("\nOrder ID: " + order.getOrderId() + ", Status: " + order.getStatus() + ", Date: " + order.getOrderDate());
            for (Product product : order.getProducts()) {
                System.out.println("  - " + product.getProductInfo());
            }
            System.out.println("Total Price: $" + order.calculateTotalPrice());
        }
    }
}
