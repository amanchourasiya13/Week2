import java.util.ArrayList;
import java.util.List;

// School class with a one-to-many relationship with Student
class School {
    private String name;
    private String address;
    private List<Student> students;

    public School(String name, String address) {
        this.name = name;
        this.address = address;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}

// Student class with a many-to-many relationship with Course
class Student {
    private String studentID;
    private String name;
    private int age;
    private List<Course> courses;

    public Student(String studentID, String name, int age) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.courses = new ArrayList<>();
    }

    public void enroll(Course course) {
        courses.add(course);
        course.enrollStudent(this);
    }

    public List<Course> viewCourses() {
        return courses;
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

// Course class with a many-to-many relationship with Student
class Course {
    private String courseID;
    private String courseName;
    private int credits;
    private List<Student> students;

    public Course(String courseID, String courseName, int credits) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.credits = credits;
        this.students = new ArrayList<>();
    }

    public void enrollStudent(Student student) {
        students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getCredits() {
        return credits;
    }
}

// Main class to demonstrate the relationships
public class SchoolStudent {
    public static void main(String[] args) {
        // Create a school
        School school = new School("Technocrats School", "Anand Nagar Bhopal");

        // Print the school name
        System.out.println("School Name: " + school.getName());
        System.out.println("School Address: " + school.getAddress());
        System.out.println("---------------------------------");

        // Create some students
        Student student1 = new Student("S001", "Aman", 17);
        Student student2 = new Student("S002", "Rohan", 18);

        // Add students to the school
        school.addStudent(student1);
        school.addStudent(student2);

        // Create some courses
        Course course1 = new Course("C001", "Mathematics", 4);
        Course course2 = new Course("C002", "Science", 3);

        // Enroll students in courses
        student1.enroll(course1);
        student1.enroll(course2);
        student2.enroll(course1);

        // Display the enrolled students for each course
        System.out.println("\nCourse: " + course1.getCourseName());
        for (Student student : course1.getStudents()) {
            System.out.println("  - " + student.getName());
        }

        System.out.println("\nCourse: " + course2.getCourseName());
        for (Student student : course2.getStudents()) {
            System.out.println("  - " + student.getName());
        }

        // Display the courses each student is enrolled in
        System.out.println("\nStudent: " + student1.getName() + " is enrolled in:");
        for (Course course : student1.viewCourses()) {
            System.out.println("  - " + course.getCourseName());
        }

        System.out.println("\nStudent: " + student2.getName() + " is enrolled in:");
        for (Course course : student2.viewCourses()) {
            System.out.println("  - " + course.getCourseName());
        }
    }
}
