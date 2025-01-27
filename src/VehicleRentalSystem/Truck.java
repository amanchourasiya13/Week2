package VehicleRentalSystem;

// Truck Class
public class Truck extends Vehicle implements Insurable {
    private double insuranceRate;

    // Constructor to initialize specific details for Truck
    public Truck(String vehicleNumber, String type, double rentalRate, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceRate = insuranceRate;
    }

    // Implement calculateRentalCost for Truck
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement Insurable methods for Truck
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: Standard coverage at " + insuranceRate * 100 + "% of rental rate.";
    }
}

