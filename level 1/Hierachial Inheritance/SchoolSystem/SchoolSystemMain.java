  // SchoolSystemMain class to test the hierarchy
public class SchoolSystemMain{
    public static void main(String[] args) {
        // Creating objects for different roles
        Person person=new Person("Aman", 21);
        Person teacher = new Teacher("Mr. Smith", 35, "Mathematics");
        Person student = new Student("Alice", 16, "10th Grade");
        Person staff = new Staff("John Doe", 45, "Administration");

        // Display information for each role
        person.displayRole();
        person.displayPersonInfo();

        System.out.println("----------");
        teacher.displayRole();
        teacher.displayPersonInfo();
        System.out.println("----------");

        student.displayRole();
        student.displayPersonInfo();
        System.out.println("----------");

        staff.displayRole();
        staff.displayPersonInfo();
    }
}
