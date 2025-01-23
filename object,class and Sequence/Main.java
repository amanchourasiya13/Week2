import java.util.List;
import java.util.ArrayList;

class Customer {
    private String customerName;
    private List<Product> purchasedProducts; // List of products the customer buys
    private int totalPrice;  // To store the running total price

    public Customer(String customerName) {
        this.customerName = customerName;
        this.purchasedProducts = new ArrayList<>();
        this.totalPrice = 0; // Initial total price is 0
    }

    // Getter for customerName
    public String getCustomerName() {
        return customerName;
    }

    // Method to buy a product
    public String buyProduct(Product product) {
        if (product.checkAvailability() > 0) {
            purchasedProducts.add(product);  // Add the product to the customer's purchase list
            totalPrice += product.getPrice(); // Add product price to totalPrice
            product.refillProduct(-1); // Reduce stock by 1
            return "Product " + product.getProductName() + " bought successfully!";
        } else {
            return "Sorry, " + product.getProductName() + " is out of stock.";
        }
    }

    // Getter for purchased products
    public List<Product> getPurchasedProducts() {
        return purchasedProducts;
    }

    // Getter for totalPrice
    public int getTotalPrice() {
        return totalPrice;
    }

    // Private feedback method (for internal use)
    private String feedback() {
        return "Thank you for shopping with us!";
    }
}

class Product {
    private String productName;
    private int price;
    private int stockCount;

    public Product(String productName, int initialStock, int price) {
        this.productName = productName;
        this.price = price;
        this.stockCount = initialStock;
    }

    // Getter for productName
    public String getProductName() {
        return productName;
    }

    // Getter for product price
    public int getPrice() {
        return price;
    }

    // Check availability of a product
    public int checkAvailability() {
        return stockCount;
    }

    // Refill product stock
    public int refillProduct(int quantity) {
        stockCount += quantity;
        return stockCount;
    }
}

class BillGenerator {
    private int totalPrice;
    private double GST;
    private int discount;

    public BillGenerator(int totalPrice, double GST, int discount) {
        this.totalPrice = totalPrice;
        this.GST = GST;
        this.discount = discount;
    }

    // Method to calculate final bill price based on totalPrice, GST, and discount
    public double calculateBill() {
        double totalWithGST = totalPrice + (totalPrice * GST / 100); // Price after adding GST
        double totalWithDiscount = totalWithGST - (totalWithGST * discount / 100); // Price after applying discount
        return totalWithDiscount;
    }

    // Method to get the bill formatted as a string
    public String getBillMethod() {
        double finalPrice = calculateBill();
        return "Total Price after GST and discount: " + finalPrice;
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating products
        Product product1 = new Product("Laptop", 10, 5000);
        Product product2 = new Product("Smartphone", 20, 15000);

        // Creating a customer
        Customer customer1 = new Customer("John Doe");

        // Customer buys products
        System.out.println(customer1.buyProduct(product1)); // Buying a Laptop
        System.out.println(customer1.buyProduct(product2)); // Buying a Smartphone

        // Total price of products purchased
        int totalPrice = customer1.getTotalPrice();
        System.out.println("Total Price before GST and discount: " + totalPrice);

        // Generating the bill for the customer
        BillGenerator bill = new BillGenerator(totalPrice, 18.0, 10); // 18% GST, 10% discount
        System.out.println(bill.getBillMethod()); // Print final bill

        // Output customer's product choice list
        System.out.println("Customer's chosen products: ");
        for (Product p : customer1.getPurchasedProducts()) {
            System.out.println(p.getProductName());
        }
    }
}
