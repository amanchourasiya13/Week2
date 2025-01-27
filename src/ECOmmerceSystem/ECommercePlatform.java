package ECOmmerceSystem;

// Main class to calculate and print final price
public class ECommercePlatform {

    public static void calculateAndPrintFinalPrice(Product product) {
        double discount = product.calculateDiscount();
        double priceAfterDiscount = product.getPrice() - discount;

        double tax = 0;
        if (product instanceof Taxable) {
            tax = ((Taxable) product).calculateTax();
        }

        double finalPrice = priceAfterDiscount + tax;
        System.out.println("Product: " + product.getName());
        System.out.println("Price: " + product.getPrice());
        System.out.println("Discount: " + discount);
        System.out.println("Tax: " + tax);
        System.out.println("Final Price: " + finalPrice);
        System.out.println("--------------------------");
    }

    public static void main(String[] args) {
        // Create different products
        Product electronics = new Electronics(1, "Smartphone", 500);
        Product clothing = new Clothing(2, "T-Shirt", 40);
        Product groceries = new Groceries(3, "Milk", 2);

        // Calculate and print the final price for each product
        calculateAndPrintFinalPrice(electronics);
        calculateAndPrintFinalPrice(clothing);
        calculateAndPrintFinalPrice(groceries);
    }
}

