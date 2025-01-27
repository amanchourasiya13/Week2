package OnlineFoodDeliverySystem;

// VegItem Class
public class VegItem extends FoodItem implements Discountable {
    private static final double TAX_RATE = 0.05; // 5% tax on veg items
    private double discount;

    // Constructor for VegItem
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discount = 0; // No discount by default
    }

    // Implement calculateTotalPrice for VegItem
    @Override
    public double calculateTotalPrice() {
        double priceBeforeTax = getPrice() * getQuantity();
        double taxAmount = priceBeforeTax * TAX_RATE;
        double priceAfterTax = priceBeforeTax + taxAmount;
        double priceAfterDiscount = priceAfterTax - (priceAfterTax * discount);
        return priceAfterDiscount;
    }

    // Implement applyDiscount method from Discountable interface
    @Override
    public void applyDiscount(double discountPercentage) {
        this.discount = discountPercentage / 100;
    }

    // Implement getDiscountDetails method from Discountable interface
    @Override
    public void getDiscountDetails() {
        if (discount > 0) {
            System.out.println("Discount applied: " + (discount * 100) + "%");
        } else {
            System.out.println("No discount applied.");
        }
    }
}
