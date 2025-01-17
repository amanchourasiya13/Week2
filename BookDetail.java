//creating a class Book contain attribute title,author and price.
class Book{
    String title;
    String author;
    double price;
//constructor
    public Book(String title,String author,double price){
        this.title=title;
        this.author=author;
        this.price=price;
    }
// method to display the book detail 
    void displayDetail(){
        System.out.println("Book title name is:"+title);
        System.out.println("book author name is: "+author);
        System.out.println("book price is: "+price);
    }
}
public class BookDetail{
    public static void main(String[] args) {
// creating a object obj  to Book class methods.
        Book obj=new Book("My India", "Freedom Fighter",101);
        obj.displayDetail();
        Book obj1=new Book("Jai Hind", "Azad ji",201);
        obj1.displayDetail();
    }
}
