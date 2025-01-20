
public class Product{
    // Class variable shared among all instances of the class
     static double discount =10.0;
    private static int count=10;
    // Instance variables
    private  final int productId;
    private String productName;
    private double price;
    private int quantity;
    // Constructor to initialize the product name and price
    public Product(String productName,double price,int quantity) {
        this.productId=++count;
        this.productName = productName;
        this.price = price;
        this.quantity=quantity;
       // totalProducts++;  // Increment total products when a new product is created
    }
        // Static method to update discount percentage
        public static void updateDiscount(double newDiscount) {
            discount = newDiscount;
            System.out.println("Discount updated to: " + discount + "%");
        }
    
        // Method to calculate the total price after discount
        public double calculateTotalPrice() {
            double total = price * quantity;
            return total - (total * discount / 100);
        }
     // Method to display product details
     public void displayProductDetails() {
        // Validate if the object is an instance of Product
        if(this instanceof Product){
            System.out.println("\nProduct Name: " + productName);
            System.out.println("prodcut id: "+productId);
            System.out.println("Price: Rs" +price);
            System.out.println("Quantity: " + quantity);
            System.out.println("Discount: " + discount + "%");
            System.out.println("Total Price After Discount: Rs" +calculateTotalPrice());
        } 
        else{
            System.out.println("The object is not instance of product");
        }
    }
    // Main method for testing the Product class
    public static void main(String[] args) {
        Product product1 = new Product("Laptop",50000,2);
    product1.displayProductDetails();
        Product product2 = new Product("Smartphone",30000,2);
        product2.displayProductDetails();
    }
}