package ECOmmerceSystem;

// Clothing class
public class Clothing extends Product implements Taxable {
    private double discountRate = 0.20; // 20% discount
    private double taxRate = 0.05; // 5% tax

    public Clothing(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }

    @Override
    public double calculateTax() {
        return getPrice() * taxRate;
    }
}
