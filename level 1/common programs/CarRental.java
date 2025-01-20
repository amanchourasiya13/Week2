public class CarRental {
    String customerName;
    String carModel;
    int rentalDays;

// parameterized constructor.
CarRental(String customerName,String carModel,int rentalDays){
this.customerName=customerName;
this.carModel=carModel;
this.rentalDays=rentalDays;
}
// method to calculate total cost
private double totalCost() {
    double carVariety = switch (carModel.toLowerCase()) {
        case "toyota rav4" -> 500.0;
        case "Maruti Suzuki" -> 400.0;
        case "Hyundai" -> 700;
        case "Tata Motors"->600;
        case "Mahindra Motors"->300;
        case"tesla"->2000;
        default ->350; // Regular coffee
    };
    return carVariety*rentalDays;
}
// display metohd.
void displayDetails(){
    System.out.println("customer name: "+customerName);
    System.out.println("car model: "+carModel);
    System.out.println("rental days: "+rentalDays);
    System.out.println("total cost: "+totalCost()+" Rs");
}
    public static void main(String[] args) {
CarRental car1=new CarRental("Mr. Raghu Nayak","tata motors",2);
        car1.displayDetails();
        System.out.println();
 CarRental car2=new CarRental("Mr.Mukesh Ambani","Tesla",2);
        car2.displayDetails(); 
    }
}
