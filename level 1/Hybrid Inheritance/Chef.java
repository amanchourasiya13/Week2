// Subclass: Chef, implementing Worker
public class Chef extends Person implements Worker {
    private String specialty;

    public Chef(String name, String id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    @Override
    public void performDuties() {
        System.out.println(name + " is cooking food. Specialty: " + specialty);
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Specialty: " + specialty);
    }
}
