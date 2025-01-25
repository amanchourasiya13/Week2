     // create a MotorCycle(subClass) extend Vehicle(parent class)
 public class Motorcycle extends Vehicle{
        int seatCapacity;
        Motorcycle(String name,int maxSpeed,String fuelType,int seatCapacity){
            super(name,maxSpeed,fuelType);
            this.seatCapacity=seatCapacity;
        }
         // method to print seat capacity of motorcycle
        void motorcycleSeatCapacity(){
            System.out.println("MotorCycle Seat Capacity: "+seatCapacity );
        }
    }