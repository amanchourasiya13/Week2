class Employee{
private  static String  CompanyName= "Capgeminini Company ";
private static int totalNumber=0;
private String name;
private  final String id;
private String designation;
Employee(String name,String id,String designation){
this.name=name;
this.id=id;
this.designation=designation;
totalNumber++;
}
static void displayTotalEmployees(){

    System.out.println(totalNumber);
}
void displayDetail(){
      if(this instanceof Employee){
        System.out.println("Company name: "+CompanyName);
        System.out.println("Employee name: "+name);
        System.out.println("Employee id: "+id);
        System.out.println("Employee designation: "+designation);
        System.out.println();
    }
    else{
        System.out.println("The object is not an instance of Employee.");
    }
}
   }
public class EmployeeManagement {
    public static void main(String[] args) {

        Employee e1=new Employee("aman", "#1246", "pune");
        e1.displayDetail();
        Employee e2=new  Employee("rahul","#2345","banglore");
           e2.displayDetail();
           System.out.print("Total no of employees:");
        Employee.displayTotalEmployees();
        
     System.out.print("Total no of employees:");
        Employee.displayTotalEmployees();
    }
}
