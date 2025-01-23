import java.util.ArrayList;
import java.util.List;

// Professor class (Represents a professor)
class Professor {
    private String professorId;
    private String name;
    private String email;
    private List<Course> courses; // Aggregation: Professor teaches multiple Courses

    // Constructor
    public Professor(String professorId, String name, String email) {
        this.professorId = professorId;
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    // Method to assign a course to the professor
    public void assignCourse(Course course) {
        courses.add(course);
    }

    // Method to view all courses the professor teaches
    public List<Course> viewCourses() {
        return courses;
    }

    // Getters
    public String getProfessorId() {
        return professorId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Course class (Represents a course)
class Course {
    private String courseId;
    private String courseName;
    private Integer credits;
    private List<Student> students; // Aggregation: Course has multiple Students
    private Professor professor; // A single Professor teaches the course

    // Constructor
    public Course(String courseId, String courseName, Integer credits) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.credits = credits;
        this.students = new ArrayList<>();
    }

    // Method to add a student to the course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Method to remove a student from the course
    public void removeStudent(Student student) {
        students.remove(student);
    }

    // Method to assign a professor to the course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
    }

    // Method to view all students in the course
    public List<Student> viewStudents() {
        return students;
    }

    // Getters
    public String getCourseId() {
        return courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public Integer getCredits() {
        return credits;
    }

    public Professor getProfessor() {
        return professor;
    }
}

// Student class (Represents a student)
class Student {
    private String studentId;
    private String name;
    private String email;
    private List<Course> courses; // Association: Student enrolls in multiple Courses

    // Constructor
    public Student(String studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
        this.courses = new ArrayList<>();
    }

    // Method to enroll in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // Add this student to the course's student list
    }

    // Method to view all courses the student is enrolled in
    public List<Course> viewCourses() {
        return courses;
    }

    // Getters
    public String getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

// Main class to test the code
public class UniversityManagementSystem {
    public static void main(String[] args) {

        // University details
        String universityName = "RajivGandhi university";
        String universityLocation = "Bhopal";


        // Print university details
        System.out.println("University Name: " + universityName);
        System.out.println("Location: " + universityLocation);
        
        // Create professors
        Professor professor1 = new Professor("P001", "Dr. Smith", "smith@example.com");
        Professor professor2 = new Professor("P002", "Dr. Johnson", "johnson@example.com");

        // Create courses
        Course course1 = new Course("C101", "Introduction to Programming", 3);
        Course course2 = new Course("C102", "Data Structures", 4);
        Course course3 = new Course("C103", "Algorithms", 4);

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);
        course3.assignProfessor(professor2);

        // Create students
        Student student1 = new Student("S001", "Aman", "aman@example.com");
        Student student2 = new Student("S002", "Lokesh", "lokesh@example.com");

        // Enroll students in courses
        student1.enrollCourse(course1);
        student1.enrollCourse(course2);
        student2.enrollCourse(course2);
        student2.enrollCourse(course3);


        // Print courses, students, and professors details
        System.out.println("\nCourses Offered:");
        for (Course course : new Course[]{course1, course2, course3}) {
            System.out.println(course.getCourseName() + " - Credits: " + course.getCredits() + " - Professor: " + course.getProfessor().getName());
            System.out.println("Students enrolled:");
            for (Student student : course.viewStudents()) {
                System.out.println("  - " + student.getName());
            }
            System.out.println();
        }

        // Print all students in the university
        System.out.println("\nStudents in the University:");
        for (Student student : new Student[]{student1, student2}) {
            System.out.println(student.getName() + " - Email: " + student.getEmail());
        }

        // Print all professors in the university
        System.out.println("\nProfessors in the University:");
        for (Professor professor : new Professor[]{professor1, professor2}) {
            System.out.println(professor.getName() + " - Email: " + professor.getEmail());
        }
    }
}
