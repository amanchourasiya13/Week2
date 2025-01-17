// creating a class MobilePhone conntains attributes mobile brand ,model and price.
class MobilePhone{
    String brand;
    String model;
    int price;
// constructor.
public MobilePhone(String brand,String model,int price){
    this.brand=brand;
    this.model=model;
    this.price=price;
}

// method to display the detail of Mobile Phone
void displayDetail(){
    System.out.print("Brand name is: "+brand+"\n Model: "+model+"\n Price: "+price+" Rs");
}
}
public class MobilePhoneDetails {
    public static void main(String[] args) {
// creating a obj object to access methods of MobilePhone class.
        MobilePhone obj=new MobilePhone("Redmi Note ","14 pro plus 5g ",30999);
        obj.displayDetail();
        MobilePhone obj1=new MobilePhone("Samsung Galaxy ","S 24 ultra 5g ",112600);
        obj1.displayDetail();
    }
}