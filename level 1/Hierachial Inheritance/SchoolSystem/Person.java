// Superclass: Person
public class Person {
    protected String name;
    protected int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // Abstract method to be implemented by subclasses
    public void displayRole() {
        System.out.println("Person");
    }
}
