//create class Employee(Parent Class or superClass).
public class Employee{
    String name;
    String id;
    double salary;
    
    Employee(String name,String id,double salary){
        this.name=name;
        this.id=id;
        this.salary=salary;
    }
     // method to display the details of Employee.
    void displayDetails(){
        System.out.println("name: "+name+", id: "+id+", salary: "+salary);
    }
     }
    