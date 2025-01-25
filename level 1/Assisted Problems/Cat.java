 // create a Cat(subclass) extend Animal(SuperClass)
public class Cat extends Animal{
    Cat(String name,int age){
        super(name,age);
      }
    // override method makeSound for cart class.
      void makeSound()
      {
          System.out.println("Cat Meow ");
      }
}