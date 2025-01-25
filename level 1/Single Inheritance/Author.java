//class Author(subclass)extends the Book(parent class).
public class Author extends Book{
// create attributes name and bio.
    String name;
    String bio;
    Author(String title,int publicationYear,String name,String bio ){
        super(title,publicationYear);
        this.name=name;
        this.bio=bio;
    }
// display the detail of Author class.
void displayAuthor(){
    System.out.println("Author name: "+name);
    System.out.println("Bio: "+bio);
}
}