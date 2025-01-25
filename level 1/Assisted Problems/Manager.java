 // create a Manager(subClass) extend Employee(parent class)
 public class Manager extends Employee{
    int teamSize;
    Manager(String name,String id,double salary,int teamSize){
        super(name,id,salary);
        this.teamSize=teamSize;
    }
     // method to print team size of manager
    void TeamSize(){
        System.out.println("Team Size Manager: "+teamSize);
    }
}