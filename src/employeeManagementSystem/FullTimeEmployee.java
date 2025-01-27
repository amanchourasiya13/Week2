package employeeManagementSystem;
public class FullTimeEmployee extends Employee implements Department{
    private double monthlyBonus;
private String departmentName;
    // Constructor for FullTimeEmployee
    public FullTimeEmployee(int employeeId, String name, double baseSalary, double monthlyBonus) {
        super(employeeId,name,baseSalary);
        this.monthlyBonus = monthlyBonus;
    }

    // Implement the abstract method to calculate salary for FullTimeEmployee
    @Override
    public double calculateSalary() {
        return getBaseSalary()+ monthlyBonus;
    }

    // Getter and Setter for monthlyBonus
    public double getMonthlyBonus() {
        return monthlyBonus;
    }

    public void setMonthlyBonus(double monthlyBonus) {
        this.monthlyBonus = monthlyBonus;
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
