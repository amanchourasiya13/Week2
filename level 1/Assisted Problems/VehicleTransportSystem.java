public class VehicleTransportSystem{
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Car car = new Car("Car",180, "Petrol", 5);

        Truck truck = new Truck("Truck",120, "Diesel", 10);

        Motorcycle motorcycle = new Motorcycle("MotorCycle",220, "Petrol", 3);

        // Store them in an array of Vehicle type
        Vehicle[] vehicles = {car, truck, motorcycle};

  // Iterate over each vehicle in the array
  for (Vehicle vehicle : vehicles) {
    // Call displayDetails() for each vehicle
    vehicle.displayDetails();

    // Check if the vehicle is an instance of Car, Truck, or Motorcycle
    if (vehicle instanceof Car) {
        ((Car) vehicle).carSeatCapacity();  // Call Car specific method
    } else if (vehicle instanceof Truck) {
        ((Truck) vehicle).truckSeatCapacity();  // Call Truck specific method
    } else if (vehicle instanceof Motorcycle) {
        ((Motorcycle) vehicle).motorcycleSeatCapacity();  // Call Motorcycle specific method
    }

    System.out.println(); // Add an empty line for better readability
}
        }
    }

