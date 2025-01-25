// Superclass: Person
public class Person {
    protected String name;
    protected String id;

    public Person(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public void displayPersonInfo() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}
