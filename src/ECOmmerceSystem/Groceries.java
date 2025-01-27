package ECOmmerceSystem;

// Groceries class
public class Groceries extends Product {
    private double discountRate = 0.05; // 5% discount

    public Groceries(int productId, String name, double price) {
        super(productId, name, price);
    }

    @Override
    public double calculateDiscount() {
        return getPrice() * discountRate;
    }
}
