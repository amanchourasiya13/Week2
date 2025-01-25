// Subclass: Student
public class Student extends Person {
    private String grade;

    public Student(String name, int age, String grade) {
        super(name, age);
        this.grade = grade;
    }

    @Override
    public void displayPersonInfo() {
        super.displayPersonInfo();
        System.out.println("Grade: " + grade);
    }

    @Override
    public void displayRole() {
        System.out.println("Student");
    }
}
