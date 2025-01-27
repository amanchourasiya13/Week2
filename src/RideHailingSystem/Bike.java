package RideHailingSystem;

// Bike subclass
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement the calculateFare method for Bike
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance; // Basic fare calculation for Bike
    }

    // Implement GPS methods for Bike
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

