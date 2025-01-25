// create a Device Class
public class Device{
  // Attributes deviceId and status
    String deviceId;
    String status;
  // parameter Constructor
Device(String deviceId,String status){
    this.deviceId=deviceId;
    this.status=status;
}
// method to display the status
  void displayStatus(){
    System.out.println("Device id: "+deviceId);
    System.out.println("Status: "+status);
  }
}