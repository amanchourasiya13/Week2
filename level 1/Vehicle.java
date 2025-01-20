public class Vehicle {
    // Instance variables
    private String ownerName;
    private String vehicleType;
    private final String registrationNumber;
    // Class variable (static), shared by all vehicles
    private static double registrationFee = 100.0; // Default registration fee

    // Constructor to initialize owner and vehicle details
    public Vehicle(String ownerName, String vehicleType,String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber=registrationNumber;
    }

    // Instance method to display vehicle details
    public void displayVehicleDetails() {
        if(this instanceof Vehicle){
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration number: "+registrationNumber);
        System.out.println("Registration Fee: Rs" + registrationFee);
    }
    else{
        System.out.println("the object is not instance of Vehicle.");
    }
    }
    // Class method to update the registration fee for all vehicles
    public static void updateRegistrationFee(double newRegistrationFee) {
        registrationFee = newRegistrationFee;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a few vehicle objects
        Vehicle vehicle1 = new Vehicle("Lokesh Choudhary", "Car","Mp04MZ012");
        Vehicle vehicle2 = new Vehicle("Ayush Sahu", "Motorcycle","Mp05MZ012");

        // Display vehicle details
        System.out.println("Vehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();

        // Update the registration fee
        Vehicle.updateRegistrationFee(150.0);

        System.out.println("\nAfter updating registration fee:");
        System.out.println("\nVehicle 1 Details:");
        vehicle1.displayVehicleDetails();

        System.out.println("\nVehicle 2 Details:");
        vehicle2.displayVehicleDetails();
    }
}

