public class EmployeeManagementSystem {
 public static void main(String[] args) {
    System.out.println("\nEmployee Details:- ");
    Employee emp=new Employee("aman", "Cap12", 400000); //create a object emp for Employee Class.
    emp.displayDetails();

    System.out.println("\nManager Details:- ");
    Manager man=new Manager("rahul", "Man12", 500000, 10); //create a man animal for Manager Class.
    man.displayDetails();   //override
    man.TeamSize();

    System.out.println("\nDeveloper Details:-");
   Developer dev=new Developer("mausam", "dev12", 120000, "Java");//create a object dev  for Developer Class.
   dev.displayDetails();  //override
   dev.printProgramming();

   System.out.println("\nIntern Details:-");
   Intern intern=new Intern("ayush", "int12", 12000, 1);//create a object intern for Intern Class.
   intern.displayDetails();  //override
   intern.printExperience();
 }   
}
