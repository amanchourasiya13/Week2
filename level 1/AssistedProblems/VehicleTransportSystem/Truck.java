     // create a Truck (subClass) extend  Vehicle(parent class)
public class Truck extends Vehicle{
        int seatCapacity;
        Truck(String name,int maxSpeed,String fuelType,int seatCapacity){
            super(name,maxSpeed,fuelType);
            this.seatCapacity=seatCapacity;
        }
         // method to print seat capacity of truck.
        void truckSeatCapacity(){
            System.out.println("Truck Seat Capacity: "+seatCapacity);
        }
    }