package employeeManagementSystem;
public class PartTimeEmployee extends Employee implements Department {
    private int hoursWorked;
    private double hourlyRate;
private String departmentName;
    // Constructor for PartTimeEmployee
    public PartTimeEmployee(int employeeId, String name, double baseSalary, int hoursWorked, double hourlyRate,String departmentName) {
        super(employeeId, name, baseSalary);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Implement the abstract method to calculate salary for PartTimeEmployee
    @Override
    public double calculateSalary() {
        return getBaseSalary() + (hoursWorked * hourlyRate);
    }

    // Getter and Setter for hoursWorked and hourlyRate
    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }
    // Implementing Department interface methods
    @Override
    public void assignDepartment(String departmentName) {
        this.departmentName = departmentName;
    }

    @Override
    public String getDepartmentDetails() {
        System.out.println(departmentName);
        return "Department: " + departmentName;
    }

}
