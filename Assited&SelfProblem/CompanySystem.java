import java.util.ArrayList;
import java.util.List;

// Employee Class
class Employee {
    private String name;
    private String position;

    // Constructor
    public Employee(String name, String position) {
        this.name = name;
        this.position = position;
    }

    // Method to get employee details
    public String getDetails() {
        return "Name: " + name + ", Position: " + position;
    }
}

// Department Class
class Department {
    private String departmentName;
    private List<Employee> employees;

    // Constructor
    public Department(String departmentName) {
        this.departmentName = departmentName;
        this.employees = new ArrayList<>();
    }

    // Method to add an employee to the department
    public void addEmployee(String name, String position) {
        employees.add(new Employee(name, position));
        System.out.println("Employee added to department: " + departmentName);
    }

    // Method to delete the department
    public void deleteDepartment() {
        employees.clear();
        System.out.println("Department " + departmentName + " and all employees deleted.");
    }

    // Method to display all employees in the department
    public void listEmployees() {
        System.out.println("Employees in " + departmentName + ":");
        for (Employee employee : employees) {
            System.out.println(employee.getDetails());
        }
    }

    // Getter for department name
    public String getDepartmentName() {
        return departmentName;
    }
}

// Company Class
class Company {
    private String companyName;
    private List<Department> departments;

    // Constructor
    public Company(String companyName) {
        this.companyName = companyName;
        this.departments = new ArrayList<>();
    }

    // Method to add a department to the company
    public void addDepartment(String departmentName) {
        departments.add(new Department(departmentName));
        System.out.println("Department added to company: " + companyName);
    }

    // Method to delete the company
    public void deleteCompany() {
        for (Department department : departments) {
            department.deleteDepartment();
        }
        departments.clear();
        System.out.println("Company " + companyName + " and all its departments and employees deleted.");
    }

    // Method to list all departments and employees in the company
    public void listDepartments() {
        System.out.println("Departments in " + companyName + ":");
        for (Department department : departments) {
            System.out.println("- " + department.getDepartmentName());
            department.listEmployees();
        }
    }

    // Get a department by name
    public Department getDepartment(String departmentName) {
        for (Department department : departments) {
            if (department.getDepartmentName().equals(departmentName)) {
                return department;
            }
        }
        System.out.println("Department not found: " + departmentName);
        return null;
    }
}

// Main Class for Testing
public class CompanySystem {
    public static void main(String[] args) {
        Company company = new Company("Capgemini ");

        company.addDepartment("IT");
        company.addDepartment("HR");

        Department itDept = company.getDepartment("IT");
        Department hrDept = company.getDepartment("HR");

        if (itDept != null) {
            itDept.addEmployee("Sanjay", "Developer");
            itDept.addEmployee("Rahul", "SysAdmin");
        }

        if (hrDept != null) {
            hrDept.addEmployee("Dev", "Recruiter");
            hrDept.addEmployee("Rohan", "HR Manager");
        }

        company.listDepartments();

        company.deleteCompany();
    }
}
