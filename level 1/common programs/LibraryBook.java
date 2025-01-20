public class LibraryBook {
    String title;
    String author;
    double price;
   boolean availability;
LibraryBook(String title,String author,double price,String availability){
this.title=title;
this.author=author;
this.price=calculatePrice();
this.availability=CheckAvailability();
}
  // method to calculate borrow price
  private double calculatePrice() {
    double pricePerBook = switch (title.toLowerCase()) {
        case "constitution of india" -> 200.0;
        case "energy source of universe" -> 500.0;
        case "cappuccino" -> 4.5;
        default -> 250.0; // Regular coffee
    };
    return pricePerBook;
}

  // method to check availability 
  private boolean CheckAvailability() {
    boolean available= switch (title.toLowerCase()) {
        case "constitution of india" ->true;
        case "energy source of universe" ->true;
        case "cappuccino" -> true;
        default -> false; // Regular coffee
    };
    return available;
  }

  void displayDetail(){
    System.out.println("Booke title: "+title);
    System.out.println("Book author: "+author);
    if(CheckAvailability()){
        System.out.println("Book is available ,you can borrow it.");
    System.out.println("Book borrow price is: "+calculatePrice());
    }
    else 
    System.out.println("Sorry,book is not available,come after 2 days");
  }
    public static void main(String[] args) {
    LibraryBook L1=new LibraryBook("constitution of india","Dr Bhim Rao Ambedkar", 0, "");
    L1.displayDetail();
    System.out.println();
    LibraryBook L2=new LibraryBook("Java Learning","kathy searra", 0, "");
    L2.displayDetail();
    }
}
