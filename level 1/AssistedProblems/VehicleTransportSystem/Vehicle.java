//create class Vehicle (Parent Class or superClass).
public class Vehicle{
    int maxSpeed;
    String fuelType;
String name;
    //parameterized construcotr with attribute maxSpeed and fuelType and array seat capacities
    Vehicle(String name,int maxSpeed,String fuelType){
        this.maxSpeed=maxSpeed;
        this.fuelType=fuelType;
        this.name=name;
    }
     // method to display the details of Vehicle.
    void displayDetails(){
        System.out.println("VehicleType:"+name+", maxSpeed: "+maxSpeed+" km/h  and  fuelType: "+fuelType+"Seat Capacity: ");
    }
     }
