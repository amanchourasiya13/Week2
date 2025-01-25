// Subclass: Staff
public class Staff extends Person {
    private String department;

    public Staff(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Department: " + department);
    }

    @Override
    public void displayRole() {
        System.out.println("Staff");
    }
}
