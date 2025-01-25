public class AnimalHierarchy{
    public static void main(String[] args) {
        System.out.println("\nAnimal Class Details: ");
       Animal animal=new Animal("Lion", 12);  //create a object animal for Animal Class.
       //override
       animal.printDetail();
       animal.makeSound();  

       System.out.println("\nDog Class Details: ");
       Dog dog=new Dog("Puppy", 7); // create a object dog for Dog class.
       //override
       dog.printDetail();
       dog.makeSound(); 

       System.out.println("\nCat Class Details: ");
       Cat cat=new Cat("Yumik", 6);  // create a object cat for Cat class.
       //override
       cat.printDetail();
       cat.makeSound(); 

       System.out.println("\nBird Class Details: ");
       Bird bird=new Bird("parrat", 12); // create a object bird for Bird class.
        //override
       bird.printDetail();
       bird.makeSound(); 

    }
}