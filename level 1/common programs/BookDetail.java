//creating a class Book contain attribute title,author and price.
class Book{
    String title;
    String author;
    double price;
// default constructor
Book(){
title="Constitution Of India";
author="Dr. Bhim Rao Ambedkar";
price=calculatePrice();
}
// parameterized constructor
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
    // method to price
    private double calculatePrice() {
        double pricePerBook = switch (title.toLowerCase()) {
            case "constitution of india" -> 200.0;
            case "energy source of universe" -> 500.0;
            case "cappuccino" -> 4.5;
            default -> 250.0; // Regular coffee
        };
        return pricePerBook;
    }

// method to display the book detail 
    void displayDetail(){
        System.out.println("Book title name is:"+title);
        System.out.println("Book author name is: "+author);
        System.out.println("Book price is: "+calculatePrice());
    }
}
public class BookDetail{
    public static void main(String[] args) {
// creating a object obj  to Book class methods.

System.out.println("default constructor:");
    Book obj1=new Book();
    obj1.displayDetail();

System.out.println("parameterized constructor:");
        Book obj=new Book("My India", "Freedom Fighter",101);
        obj.displayDetail();

    }
}
