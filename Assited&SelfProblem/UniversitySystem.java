import java.util.ArrayList;
import java.util.List;

// Faculty class (Aggregation relationship with Department)
class Faculty {
    private String name;
    private String position;

    public Faculty(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Assign faculty to a department
    public void assignDepartment(Department department) {
        department.addFaculty(this);
    }

    // Remove faculty from a department
    public void removeFromDepartment(Department department) {
        department.removeFaculty(this);
    }

    public String getName() {
        return name;
    }

    public String getPosition() {
        return position;
    }
}

// Department class (Composition with University, Aggregation with Faculty)
class Department {
    private String departmentName;
    private List<Faculty> facultyMembers;

    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.facultyMembers = new ArrayList<>();
    }

    // Add faculty member to department
    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
    }

    // Remove faculty member from department
    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }
}

// University class (Composition with Department)
class University {
    private String name;
    private String location;
    private List<Department> departments;

    public University(String name, String location) {
        this.name = name;
        this.location = location;
        this.departments = new ArrayList<>();
    }

    // Add department to university
    public void addDepartment(Department department) {
        departments.add(department);
    }

    // Remove department from university (deletes departments when university is deleted)
    public void removeDepartment(Department department) {
        departments.remove(department);
    }

    // Get the name of the university
    public String getName() {
        return name;
    }

    // Get the location of the university
    public String getLocation() {
        return location;
    }

    // Get the departments in the university
    public List<Department> getDepartments() {
        return departments;
    }
}

// Main class to demonstrate the relationships
public class UniversitySystem {
    public static void main(String[] args) {
        // Create a university
        University university = new University("Rajiv Gandhi University", "Bhopal");

        // Create departments
        Department department1 = new Department("Computer Science");
        Department department2 = new Department("Mathematics");

        // Add departments to university
        university.addDepartment(department1);
        university.addDepartment(department2);

        // Create faculty members
        Faculty faculty1 = new Faculty("Dr. Alice", "Professor");
        Faculty faculty2 = new Faculty("Dr. Bob", "Associate Professor");
        Faculty faculty3 = new Faculty("Dr. Charlie", "Assistant Professor");

        // Assign faculty members to departments
        faculty1.assignDepartment(department1);
        faculty2.assignDepartment(department1);
        faculty3.assignDepartment(department2);

        // Print details of the university and its departments
        System.out.println("University: " + university.getName());
        System.out.println("Location: " + university.getLocation());
        System.out.println("Departments in the University:");
        
        for (Department dept : university.getDepartments()) {
            System.out.println("\nDepartment: " + dept.getDepartmentName());
            System.out.println("Faculty Members:");
            for (Faculty faculty : dept.getFacultyMembers()) {
                System.out.println("  - " + faculty.getName() + ", " + faculty.getPosition());
            }
        }

        // Remove faculty member from department
        faculty1.removeFromDepartment(department1);

        System.out.println("\nAfter removing Dr. Alice from Computer Science Department:");
        for (Department dept : university.getDepartments()) {
            System.out.println("\nDepartment: " + dept.getDepartmentName());
            System.out.println("Faculty Members:");
            for (Faculty faculty : dept.getFacultyMembers()) {
                System.out.println("  - " + faculty.getName() + ", " + faculty.getPosition());
            }
        }

        // Remove a department from the university (Simulates deletion of department when university is deleted)
        university.removeDepartment(department2);

        System.out.println("\nAfter removing Mathematics department from the University:");
        for (Department dept : university.getDepartments()) {
            System.out.println("\nDepartment: " + dept.getDepartmentName());
            System.out.println("Faculty Members:");
            for (Faculty faculty : dept.getFacultyMembers()) {
                System.out.println("  - " + faculty.getName() + ", " + faculty.getPosition());
            }
        }
    }
}
