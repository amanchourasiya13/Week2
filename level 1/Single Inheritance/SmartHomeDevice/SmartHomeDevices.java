public class SmartHomeDevices {
    public static void main(String[] args) {
        Device d1=new Device("#231","on");//create object d1 for class Device.
        System.out.println("Device Class:- ");
        d1.displayStatus();          
         // create object t for access Thermostat class.
        Thermostat t=new Thermostat("#231", "On", "20 C ");
        System.out.println("Thermostat Class:- ");
        t.displayStatus(); 
        t.displayThermmostat();
    }
}