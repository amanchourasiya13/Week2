// Parent class: Student
 class Student {
    // Instance Variables
    public int rollNumber;   // Public: accessible from anywhere
    protected String name;    // Protected: accessible within the class, subclasses, and classes in the same package
    private double CGPA;      // Private: accessible only within the Student class

    // Constructor to initialize student details
    public Student(int rollNumber, String name, double CGPA) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }

    // Public method to get the CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Public method to set a new CGPA
    public void setCGPA(double CGPA) {
        if (CGPA >= 0 && CGPA <= 10) {
            this.CGPA = CGPA;
        } else {
            System.out.println("Invalid CGPA value. It must be between 0 and 10.");
        }
    }

    // Method to display student details
    public void displayStudentDetails() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + CGPA);
    }
}

// Subclass: PostgraduateStudent
class PostgraduateStudent extends Student {

    // Constructor to initialize postgraduate student details
    public PostgraduateStudent(int rollNumber, String name, double CGPA) {
        super(rollNumber, name, CGPA); // Calling parent class constructor
    }

    // Method to display postgraduate student details, showing protected member access
    public void displayPostgraduateDetails() {
        System.out.println("\n Postgraduate Student Details:");
        // Accessing the protected 'name' variable from the parent class
        System.out.println("Name: " + name);
        // Call the inherited method from the parent class to display CGPA and roll number
        displayStudentDetails();
    }
}

// Main class to test the functionality
public class UniversityManagementSystem{
    public static void main(String[] args) {
        // Creating an instance of the Student class
        Student student = new Student(101, "Alice", 9.5);
        
        // Displaying student details
        System.out.println("Student Details:");
        student.displayStudentDetails();
        
        // Modifying CGPA using the setter method
        student.setCGPA(8.9);
        System.out.println("\nUpdated Student Details:");
        student.displayStudentDetails();
        
        // Creating an instance of PostgraduateStudent class
        PostgraduateStudent pgStudent = new PostgraduateStudent(201, "Bob", 9.0);
        
        // Displaying postgraduate student details
      //  System.out.println("\nPostgraduate Student Details:");
        pgStudent.displayPostgraduateDetails();
    }
}
