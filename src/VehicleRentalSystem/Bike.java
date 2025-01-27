package VehicleRentalSystem;

// Bike Class
public class Bike extends Vehicle implements Insurable {
    private double insuranceRate;

    // Constructor to initialize specific details for Bike
    public Bike(String vehicleNumber, String type, double rentalRate, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceRate = insuranceRate;
    }

    // Implement calculateRentalCost for Bike
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement Insurable methods for Bike
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Bike Insurance Policy: Standard coverage at " + insuranceRate * 100 + "% of rental rate.";
    }
}
