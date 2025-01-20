public class HotelBooking {
    String guestName;
    String roomType;
    int nights;

HotelBooking(){
    guestName="mohan rao";
    roomType="delux";
    nights=2;
}
HotelBooking(String guestName,String roomType,int nights){
    this.guestName=guestName;
    this.roomType=roomType;
    this.nights=nights;
}
// copy constructor from reference paramterzed constructor.
HotelBooking(HotelBooking previous){
    this.guestName=previous.guestName;
    this.roomType=previous.roomType;
    this.nights=previous.nights;
}
 void displayDetails(){
    System.out.println("hotel guest name is: "+guestName);
    System.out.println("hotel room type is: "+roomType);
    System.out.println("stay nights in hotel is: "+nights);
 }

    public static void main(String[] args) {
        System.out.println("------default constructor-----");
    HotelBooking h1=new HotelBooking();
    h1.displayDetails();
        System.out.println("----parameterized constructor----");
    HotelBooking h2=new HotelBooking("Bill gates","vip",2);
    h2.displayDetails();
        System.out.println("--copy constructor from refernce paramterized constructor--");
    HotelBooking h3=new HotelBooking(h2);
    h3.displayDetails();
    }
}