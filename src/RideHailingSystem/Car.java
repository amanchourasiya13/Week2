package RideHailingSystem;

// Car subclass
class Car extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Car(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement the calculateFare method for Car
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Basic fare calculation for Car
    }

    // Implement GPS methods for Car
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}
