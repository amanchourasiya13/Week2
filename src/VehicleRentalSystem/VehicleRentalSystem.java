package VehicleRentalSystem;

import java.util.ArrayList;
import java.util.List;

public class VehicleRentalSystem {
    public static void main(String[] args) {
        // Creating sample vehicles
        Vehicle car = new Car("C123", "Car", 50, 0.1); // 10% insurance rate
        Vehicle bike = new Bike("B456", "Bike", 20, 0.05); // 5% insurance rate
        Vehicle truck = new Truck("T789", "Truck", 100, 0.2); // 20% insurance rate

        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();
        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Display rental and insurance details
        displayVehicleDetails(vehicles, 7); // Calculate rental and insurance for 7 days
    }

    // Method to display rental and insurance details
    public static void displayVehicleDetails(List<Vehicle> vehicles, int days) {
        for (Vehicle vehicle : vehicles) {
            double rentalCost = vehicle.calculateRentalCost(days);
            System.out.println("Vehicle Type: " + vehicle.getType() + " (" + vehicle.getVehicleNumber() + ")");
            System.out.println("Rental Cost for " + days + " days: $" + rentalCost);

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                double insuranceCost = insurableVehicle.calculateInsurance();
                System.out.println("Insurance Cost: $" + insuranceCost);
                System.out.println(insurableVehicle.getInsuranceDetails());
            }

            System.out.println(); // Empty line for readability
        }
    }
}
