// Create Course(Base Class)
public class Course {
    String courseName;
    int duration; // Duration in hours

    // Constructor to initialize the base class attributes
    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    // Method to display the basic course details
    public void displayCourseDetails() {
        System.out.println("\nCourse Name: " + courseName);
        System.out.println("Duration: " + duration + " hours");
    }
}
