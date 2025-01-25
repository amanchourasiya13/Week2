
     // create a Car (subClass) extend Vehicle(parent class)
 public class Car extends Vehicle{
        int seatCapacity;
        Car(String name,int maxSpeed,String fuelType,int seatCapacity){
            super(name,maxSpeed,fuelType);
            this.seatCapacity=seatCapacity;
        }
         // method to print team size of manager
        void carSeatCapacity(){
            System.out.println("Car Seat Capacity: "+seatCapacity);
        }
    }