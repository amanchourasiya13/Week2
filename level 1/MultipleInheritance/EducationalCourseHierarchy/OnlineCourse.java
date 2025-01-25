// Create OnlineCourse (Subclass of Course)
public class OnlineCourse extends Course {
    String platform; // The platform where the course is offered (e.g., Udemy, Coursera)
    boolean isRecorded; // Whether the course content is recorded

    // Constructor to initialize OnlineCourse attributes along with the base class attributes
    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        // Call the superclass (Course) constructor
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    // Method to display the online course details
    public void displayOnlineCourseDetails() {
        displayCourseDetails(); // Call the base class method
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}
