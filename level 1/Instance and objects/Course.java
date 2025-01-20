public class Course {
    // Instance variables
    private String courseName;
    private int duration; // Duration in months
    private double fee; // Fee for the course

    // Class variable (static), common for all courses
    private static String instituteName = "Technocrats Institute";

    // Constructor to initialize the course details
    public Course(String courseName, int duration, double fee) {
        this.courseName = courseName;
        this.duration = duration;
        this.fee = fee;
    }

    // Instance method to display the course details
    public void displayCourseDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " months");
        System.out.println("Fee: Rs" + fee);
        System.out.println("Institute: " + instituteName);
    }

    // Class method to update the institute name for all courses
    public static void updateInstituteName(String newInstituteName) {
        instituteName = newInstituteName;
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Create a few courses
        Course course1 = new Course("Java Programming", 6, 5000);
        Course course2 = new Course("Data Structures", 4, 4000);

        // Display course details
        System.out.println("Course 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();

        // Update institute name
        Course.updateInstituteName("Bridge Labz ");

        System.out.println("\nAfter updating institute name:");
        System.out.println("\nCourse 1 Details:");
        course1.displayCourseDetails();

        System.out.println("\nCourse 2 Details:");
        course2.displayCourseDetails();
    }
}
