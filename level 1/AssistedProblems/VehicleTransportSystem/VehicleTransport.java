

//  // Create class Vehicle (Parent Class or SuperClass)
// class Vehicle {
// String name;
//     int maxSpeed;
//     String fuelType;
//     int[] seatCapacities;  // Store seat capacities for all vehicles

//     // Parameterized constructor with attributes maxSpeed, fuelType, and seatCapacities
//     Vehicle(String name,int maxSpeed, String fuelType, int[] seatCapacities) {
//         this.maxSpeed = maxSpeed;
//         this.fuelType = fuelType;
//         this.seatCapacities = seatCapacities;
//         this.name=name;
//     }

//     // Method to display the details of Vehicle
//     void displayDetails() {
//         System.out.println("Vehicle Type: "+name+", Max Speed: " + maxSpeed + " km/h and Fuel Type: " + fuelType);
//     }

//     // Method to display seat capacities (common for all vehicles)
//     void displaySeatCapacities() {
//         System.out.print("Seat Capacities: ");
//         for (int capacity : seatCapacities) {
//             System.out.print(capacity + " ");
//         }
//         System.out.println();
//     }
// }

// // Create a Car (subclass) that extends Vehicle (parent class)
// class Car extends Vehicle {
//     Car(String name,int maxSpeed, String fuelType, int[] seatCapacities) {
//         super(name,maxSpeed, fuelType, seatCapacities);
//     }
// }

// // Create a Truck (subclass) that extends Vehicle (parent class)
// class Truck extends Vehicle {
//     Truck(String name,int maxSpeed, String fuelType, int[] seatCapacities) {
//         super(name,maxSpeed, fuelType, seatCapacities);
//     }
// }

// // Create a Motorcycle (subclass) that extends Vehicle (parent class)
// class Motorcycle extends Vehicle {
//     Motorcycle(String name,int maxSpeed, String fuelType, int[] seatCapacities) {
//         super(name,maxSpeed, fuelType, seatCapacities);
//     }
// }

// public class VehicleTransport{
//     public static void main(String[] args) {
//         // Create instances of different vehicle types with seat capacity arrays
//         Vehicle car = new Car("Car",180, "Petrol", new int[] {4, 5});
//         Vehicle truck = new Truck("Truck",120, "Diesel", new int[] {10, 12});
//         Vehicle motorcycle = new Motorcycle("MotorCycle",220, "Petrol", new int[] {2, 3});

//         // Store all vehicles in a single array of type Vehicle
//         Vehicle[] vehicles = {car, truck, motorcycle};

//         // Iterate over each vehicle in the array
//         for (Vehicle vehicle : vehicles) {
//             // Call displayDetails() for each vehicle
//             vehicle.displayDetails();
            
//             // Call displaySeatCapacities() for each vehicle
//             vehicle.displaySeatCapacities();
            
//             System.out.println(); // Add an empty line for better readability
//         }
//     }
// }

 