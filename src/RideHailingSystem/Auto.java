package RideHailingSystem;

// Auto subclass
class Auto extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Auto(String vehicleId, String driverName, double ratePerKm, String currentLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = currentLocation;
    }

    // Implement the calculateFare method for Auto
    @Override
    public double calculateFare(double distance) {
        return getRatePerKm() * distance + 10; // Base fare + distance charge for Auto
    }

    // Implement GPS methods for Auto
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        currentLocation = newLocation;
    }
}

