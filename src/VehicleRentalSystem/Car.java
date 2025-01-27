package VehicleRentalSystem;

// Car Class
public class Car extends Vehicle implements Insurable {
    private double insuranceRate;

    // Constructor to initialize specific details for Car
    public Car(String vehicleNumber, String type, double rentalRate, double insuranceRate) {
        super(vehicleNumber, type, rentalRate);
        this.insuranceRate = insuranceRate;
    }

    // Implement calculateRentalCost for Car
    @Override
    public double calculateRentalCost(int days) {
        return getRentalRate() * days;
    }

    // Implement Insurable methods for Car
    @Override
    public double calculateInsurance() {
        return getRentalRate() * insuranceRate;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: Standard coverage at " + insuranceRate * 100 + "% of rental rate.";
    }
}
