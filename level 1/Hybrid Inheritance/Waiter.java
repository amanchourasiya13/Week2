// Subclass: Waiter, implementing Worker
public class Waiter extends Person implements Worker {
    private String section;

    public Waiter(String name, String id, String section) {
        super(name, id);
        this.section = section;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is serving food in the " + section + " section.");
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Section: " + section);
    }
}
