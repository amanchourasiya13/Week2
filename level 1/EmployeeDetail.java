// creating a class, name as Employee 
class Employee{
 String name;
 int id;
 double salary;

// constructor.
public Employee(String name,int id,double salary){
 this.name=name;
 this.id=id;
 this.salary=salary;
}

// method for display the information of employee
void displayDetail(){
 System.out.println("Employee name is: "+name);
 System.out.println("Employee id is: "+id);
 System.out.println("Employee salary is: "+salary);
}
 }
public class EmployeeDetail{
 public static void main(String[]args){
// creating a object obj to access Employee class.
  Employee obj=new Employee("Aman",24085,26245);
  Employee obj1=new Employee("Rohan",24086,26800);
  obj.displayDetail();
  obj1.displayDetail();

    }
}