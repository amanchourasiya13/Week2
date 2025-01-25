// Subclass: Teacher
public class Teacher extends Person {
    private String subject;

    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Subject: " + subject);
    }

    @Override
    public void displayRole() {
        System.out.println("Teacher");
    }
}
