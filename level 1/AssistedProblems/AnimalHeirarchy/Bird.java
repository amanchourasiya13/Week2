//create a Bird(Subclass) extends Animal(SuperClass)
class Bird extends Animal{
    Bird(String name,int age){
        super(name,age);
      }
    // Method to overdie makeSound in Bird class.
      void makeSound()
      {
          System.out.println("Bird Sound.");
      }
}