 class Book {
  private static String  LibraryName= " Eklavya library ";
   private  String title;
  private   String author;
  private   final String  isbn;
 Book(String title,String author,String isbn){

this.title=title;
this.author=author;
this.isbn=isbn;
}
// method to display library name
static void displayLibraryName(){
  System.out.println("Library Name: "+LibraryName);
}
// method display detail
  void displayDetail(){
    if (this instanceof Book) {
    System.out.println("Booke title: "+title);
    System.out.println("Book author: "+author);
    System.out.println("isbn :"+isbn);
    }
   else {
    System.out.println("The object is not an instance of the Book class.");
   }
  }
}
  public class LibraryManagement{
    public static void main(String[] args) {
      Book.displayLibraryName();
    Book L1=new Book("constitution of india","Dr Bhim Rao Ambedkar", "#1234567");
    L1.displayDetail();
    System.out.println();
    Book L2=new Book("Java Learning","kathy searra", "#1234567");
    L2.displayDetail();
    }
}
