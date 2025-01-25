// class Thermostat(subclass)extends Device(parentClass)
public class Thermostat extends Device{
    // attribute temperatureSetting
String temperatureSetting;
Thermostat(String deviceId,String status,String temperatureSetting){
    super(deviceId,status);    // access the Device class attributes or  constructor.
    this.temperatureSetting=temperatureSetting;
}
//method to display the temperature setting.
void displayThermmostat(){
    System.out.println("Temperature Setting: "+temperatureSetting);
}
}

