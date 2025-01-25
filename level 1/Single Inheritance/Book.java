//create class Book With Attributes Title and publicationYear
public class Book {
    String title;
    int publicationYear;

    // parameter constructor 
Book(String title,int publicationYear){
    this.title=title;
    this.publicationYear=publicationYear;
}
// method to display the detail of book class.
void displayInfo(){
    System.out.println("Book Title: "+title);
    System.out.println("Book Publication Year: "+publicationYear);
}   
}
