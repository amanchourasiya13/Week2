public class Product {
    // Class variable shared among all instances of the class
    private static int totalProducts = 0;
    
    // Instance variables
    private String productName;
    private double price;

    // Constructor to initialize the product name and price
    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
        totalProducts++;  // Increment total products when a new product is created
    }

    // Instance method to display the details of a product
    public void displayProductDetails() {
        System.out.println("Product Name: " + this.productName);
        System.out.println("Price: $" + this.price);
    }

    // Class method to display the total number of products created
    public static void displayTotalProducts() {
        System.out.println("Total products created: " + totalProducts);
    }

    // Main method for testing the Product class
    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000);
        Product product2 = new Product("Smartphone", 800);

        // Display details of the individual products
        product1.displayProductDetails();
        product2.displayProductDetails();

        // Display the total number of products created
        Product.displayTotalProducts();
    }
}
