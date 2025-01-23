import java.util.ArrayList;
import java.util.List;

// Subject class (Represents a subject)
class Subject {
    private String subjectID;
    private String subjectName;
    private float marks;

    // Constructor
    public Subject(String subjectID, String subjectName, float marks) {
        this.subjectID = subjectID;
        this.subjectName = subjectName;
        this.marks = marks;
    }

    // Getter for marks
    public float getMarks() {
        return marks;
    }

    // Getter for subject name
    public String getSubjectName() {
        return subjectName;
    }

    // Getters
    public String getSubjectID() {
        return subjectID;
    }

    // Method to get the average marks for the subject (just a placeholder for calculation)
    public float getAverage() {
        return marks;
    }
}

// Student class (Represents a student)
class Student {
    private String studentID;
    private String name;
    private List<Subject> subjects; // One student can have multiple subjects

    // Constructor
    public Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
        this.subjects = new ArrayList<>();
    }

    // Method to add a subject to the student
    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    // Getter for student ID
    public String getStudentID() {
        return studentID;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Method to calculate the average marks of all subjects
    public float getAverageMarks() {
        float totalMarks = 0;
        for (Subject subject : subjects) {
            totalMarks += subject.getMarks();
        }
        return subjects.size() > 0 ? totalMarks / subjects.size() : 0;
    }

    // Getter for subjects list
    public List<Subject> getSubjects() {
        return subjects;
    }
}

// GradeCalculator class (Calculates grades based on average marks)
class GradeCalculator {

    // Method to calculate the overall average score of the student
    public double getCalculate(Student student) {
        return student.getAverageMarks();
    }

    // Method to assign grade based on average marks
    public char assignGrade(double averageMarks) {
        if (averageMarks >= 90) {
            return 'A';
        } else if (averageMarks >= 80) {
            return 'B';
        } else if (averageMarks >= 70) {
            return 'C';
        } else if (averageMarks >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
}

// Main class to test the code
public class SchoolResultSystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("S001", "John");
        Student student2 = new Student("S002", "Aman");

        // Create subjects
        Subject subject1 = new Subject("SUB001", "Mathematics", 95);
        Subject subject2 = new Subject("SUB002", "Science", 88);
        Subject subject3 = new Subject("SUB001", "Mathematics", 75);
        Subject subject4 = new Subject("SUB002", "Scienve", 65);

        // Add subjects to students
        student1.addSubject(subject1);
        student1.addSubject(subject2);

        student2.addSubject(subject3);
        student2.addSubject(subject4);

        // Create GradeCalculator object
        GradeCalculator gradeCalculator = new GradeCalculator();

        // Calculate average marks and assign grade for student1
        double averageMarks1 = gradeCalculator.getCalculate(student1);
        char grade1 = gradeCalculator.assignGrade(averageMarks1);

        // Calculate average marks and assign grade for student2
        double averageMarks2 = gradeCalculator.getCalculate(student2);
        char grade2 = gradeCalculator.assignGrade(averageMarks2);

        // Print details for student1
        System.out.println("Student: " + student1.getName() + " (ID: " + student1.getStudentID() + ")");
        System.out.println("Subjects and Marks:");
        for (Subject subject : student1.getSubjects()) {
            System.out.println("  " + subject.getSubjectName() + ": " + subject.getMarks());
        }
        System.out.println("Average Marks: " + averageMarks1);
        System.out.println("Grade: " + grade1);
        System.out.println();

        // Print details for student2
        System.out.println("Student: " + student2.getName() + " (ID: " + student2.getStudentID() + ")");
        System.out.println("Subjects and Marks:");
        for (Subject subject : student2.getSubjects()) {
            System.out.println("  " + subject.getSubjectName() + ": " + subject.getMarks());
        }
        System.out.println("Average Marks: " + averageMarks2);
        System.out.println("Grade: " + grade2);
    }
}
