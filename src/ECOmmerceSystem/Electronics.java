package ECOmmerceSystem;

// Electronics class
public class Electronics extends Product implements Taxable {
    private double discountRate = 0.10; // 10% discount
    private double taxRate = 0.18; // 18% tax

    public Electronics(int productId, String name, double price) {
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

