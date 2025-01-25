public class EducationalCourse {
    public static void main(String[] args) {
        // Creating an instance of Course (Base class)
        Course course = new Course("Introduction to Java", 30);
        course.displayCourseDetails();

        // Creating an instance of OnlineCourse (Subclass of Course)
        OnlineCourse onlineCourse = new OnlineCourse("Web Development Basics", 40, "Udemy", true);
        onlineCourse.displayOnlineCourseDetails();

        // Creating an instance of PaidOnlineCourse (Subclass of OnlineCourse)
        PaidOnlineCourse paidOnlineCourse = new PaidOnlineCourse("Advanced Python Programming", 50, "Coursera", true, 199.99, 20);
        paidOnlineCourse.displayPaidOnlineCourseDetails();
    }
}

