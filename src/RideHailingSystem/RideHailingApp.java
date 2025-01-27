package RideHailingSystem;

public class RideHailingApp {
    public static void main(String[] args) {
        // Create instances of different vehicles
        Vehicle car = new Car("V123", "John Smith", 10.0, "Downtown");
        Vehicle bike = new Bike("V456", "Jane Doe", 5.0, "Uptown");
        Vehicle auto = new Auto("V789", "Mike Johnson", 7.0, "Midtown");

        // Demonstrating polymorphism - Calculating fare for different vehicles dynamically
        Vehicle[] vehicles = {car, bike, auto};

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            double fare = vehicle.calculateFare(15); // Calculate fare for 15 km
            System.out.println("Fare for 15 km: $" + fare);
            System.out.println("-----------------------------");
        }

        // Demonstrate location update for a vehicle
        ((GPS) car).updateLocation("Airport");
        System.out.println("Updated Location for Car: " + ((GPS) car).getCurrentLocation());
    }
}

