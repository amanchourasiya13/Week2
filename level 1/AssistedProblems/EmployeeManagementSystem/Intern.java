 // create a Intern(subClass) extend Employee(parent class)
 public class Intern extends Employee{
    int experience;
    Intern(String name,String id,int salary,int experience){
        super(name,id,salary);
        this.experience=experience;
    }
     // method to print experience of intern.
    void printExperience(){
        System.out.println("Intern Experience: "+experience+" years");
    }
}
