package employeeManagementSystem;
import java.util.ArrayList;
import java.util.List;
public class EmployeeManagementSystem {
    public static void main(String[] args) {
        // Create FullTimeEmployee and PartTimeEmployee instances
        FullTimeEmployee fullTimeEmp1 = new FullTimeEmployee(1, "John ", 5000, 1000);
        fullTimeEmp1.assignDepartment("HR");

        FullTimeEmployee fullTimeEmp2 = new FullTimeEmployee(2, "Rohan", 6000, 1000);
        fullTimeEmp2.assignDepartment("Manager");

        PartTimeEmployee partTimeEmp1 = new PartTimeEmployee(1, "Sohan", 2000, 40, 20,"Sales");
        partTimeEmp1.assignDepartment("Sales");

        PartTimeEmployee partTimeEmp2 = new PartTimeEmployee(2, "Mohan", 2000, 40, 20,"marketing");
        partTimeEmp2.assignDepartment("Sales");

        // Creating a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(fullTimeEmp1);
        employees.add(fullTimeEmp2);
        employees.add(partTimeEmp1);
        employees.add(partTimeEmp2);

        // Displaying details using polymorphism
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("----------------------------");
       }
  }

}