// creating a Item class contains attributes item name,code and price.
class Item{
    String itemName;
    String itemCode;
    double price;
// constructor
public Item(String itemName,String itemCode,double price){
    this.itemName=itemName;
    this.itemCode=itemCode;
    this.price=price;
}

// method to calculate the cost of item 
public static double CalculateTotalCost(double price){
    int quantity= 10;
    return (double)price*quantity;
}

// method to display the item details.
void displayDetail(){
System.out.println("Item Name is: "+itemName);
System.out.println("item code is: "+itemCode);
System.out.println("item price is: "+price);
System.out.println("total cost for 10 items is: "+CalculateTotalCost(price));
}
}
public class TrackItems{
    public static void main(String[] args) {
// creating an obj object to access methods of item class.
        Item obj=new Item("Bata Shoes","#2401801",566);
        obj.displayDetail();
        Item obj1=new Item("Adidas Shoes","#3401802",700);
        obj1.displayDetail();
    }
}
