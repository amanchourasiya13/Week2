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
    System.out.println("\nBook title: "+title);
    System.out.println("Book author: "+author);
    System.out.println("isbn :"+isbn);
    }
  }
class Lib extends Book{
  Lib(String title,String author,String isbn){
    super(title,author,isbn);
  }
}
  public class LibraryManagement{
    public static void main(String[] args) {
      Book L1=new Lib("constitution of india","Dr Bhim Rao Ambedkar", "#1234567");
      if(L1 instanceof Book){
        Book.displayLibraryName();
         L1.displayDetail();
      }
      Book L2=new Lib("Java Learning","kathy searra", "#1234567");
   if(L2 instanceof Lib){
    L2.displayDetail();
    }
    Lib L3=new Lib("constitution of india","Dr Bhim Rao Ambedkar", "#1234567");
    if(L3 instanceof Book){
      L3.displayDetail();
    }
    }
}
