// Create PaidOnlineCourse  (Subclass of OnlineCourse)
public class PaidOnlineCourse extends OnlineCourse {
    double fee; // Fee for the course
    double discount; // Discount offered on the course fee

    // Constructor to initialize PaidOnlineCourse attributes along with the base class attributes
    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        // Call the superclass (OnlineCourse) constructor
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    // Method to display paid online course details
    public void displayPaidOnlineCourseDetails() {
        displayOnlineCourseDetails(); // Call the OnlineCourse method
        System.out.println("Fee: $" + fee);
        System.out.println("Discount: " + discount + "%");
        System.out.println("Final Fee after Discount: $" + calculateFinalFee());
    }

    // Method to calculate the final fee after discount
    private double calculateFinalFee() {
        return fee - (fee * (discount / 100));
    }
}
