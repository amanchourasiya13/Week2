 // Main class to test hybrid inheritance
 public class VehicleManagementMain {
    public static void main(String[] args) {
        // Create instances of ElectricVehicle and PetrolVehicle
        Vehicle electricCar = new ElectricVehicle("Tesla Model S", 250, 100);
        Vehicle petrolCar = new PetrolVehicle("Ford Mustang", 220, 60);

        // Display information and perform actions for Electric Vehicle
        System.out.println("Electric Vehicle:");
        electricCar.displayVehicleInfo();
        ((ElectricVehicle) electricCar).charge(); // Charging electric vehicle
        System.out.println();

        // Display information and perform actions for Petrol Vehicle
        System.out.println("Petrol Vehicle:");
        petrolCar.displayVehicleInfo();
        ((PetrolVehicle) petrolCar).refuel(); // Refueling petrol vehicle
    }
}