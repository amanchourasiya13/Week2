// create a Dog(subClass) extend Animal(parent class)
class Dog extends Animal{
    Dog(String name,int age){
      super(name,age);  //super is used to call the animal class constructor.
    }
// over ride method makeSound in dog class.
    void makeSound()
    {
        System.out.println("Dog barking.");
    }

}