// Parent class: Employee
class Employee {
    // Instance variables
    public int employeeID;    // Public: accessible from anywhere
    protected String department; // Protected: accessible within the class, subclasses, and classes in the same package
    private double salary;    // Private: accessible only within the Employee class

    // Constructor to initialize employee details
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter method to get the salary
    public double getSalary() {
        return salary;
    }

    // Setter method to modify the salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount. Salary cannot be negative.");
        }
    }

    // Method to display employee details
    public void displayEmployeeDetails() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: Rs" + salary);
    }
}

// Subclass: Manager
class Manager extends Employee {

    // Constructor to initialize Manager details
    public Manager(int employeeID, String department, double salary) {
        super(employeeID, department, salary); // Calling parent class constructor
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("\nManager Details:");
        // Accessing the public 'employeeID' and protected 'department' from the parent class
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
    }
}

// Main class to test the functionality
public class EmployeeRecords {
    public static void main(String[] args) {
        // Creating an instance of Employee class
        Employee employee = new Employee(1001, "Engineering", 75000.0);
        
        // Displaying employee details
        System.out.println("Employee Details:");
        employee.displayEmployeeDetails();
        
        // Modifying salary using the setter method
        employee.setSalary(80000.0);
        System.out.println("\nUpdated Employee Details:");
        employee.displayEmployeeDetails();
        
        // Creating an instance of Manager class
        Manager manager = new Manager(2001, "Sales", 95000.0);
        
        // Displaying manager details
      //  System.out.println("\nManager Details:");
        manager.displayManagerDetails();
        
        // Accessing the salary using the getter method
        double managerSalary = manager.getSalary();
        System.out.println("Manager Salary: $" + managerSalary);
        
        // Attempting to modify the salary to a negative value (Invalid scenario)
        System.out.println("\nTry to access negative value: ");
        manager.setSalary(-1000.0); // Invalid operation, won't update the salary
    }
}
