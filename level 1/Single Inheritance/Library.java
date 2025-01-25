public class Library {
 public static void main(String[] args) {
   // create an b1 object for aceess book class.
   Book b1=new Book("golden era of india", 2002);
   System.out.println("Book Class:- ");
   b1.displayInfo();
   // create an object a1  of Author class.
    Author a1=new Author("Golden Era Of India", 2002, "Hidden", "The  Memory Of India");
    System.out.println("Author Class:- ");
    a1.displayInfo();
    a1.displayAuthor();
 }   
}
