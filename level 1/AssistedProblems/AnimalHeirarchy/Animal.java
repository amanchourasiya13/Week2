//create class Animal Parent Class or superClass. 
public class Animal{
    String name;
    int age;

// parameter constructor with attributes name and age.
    Animal(String name,int age){
  this.name=name;
 this.age=age;
    }
 // method to print sound of Animal
void makeSound(){
    System.out.println("Lion Roar");
}
// method to print details of animal.
void printDetail(){
    System.out.println("name: "+name);
    System.out.println("Age: "+age);
}
}