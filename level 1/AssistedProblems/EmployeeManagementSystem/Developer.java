 // create a Developer(subClass) extend Employee(parent class)
 public class Developer extends Employee{
    String programming;
    Developer(String name,String id,double salary,String programming){
        super(name,id,salary);
        this.programming=programming;
    }
     // method to print prgoramming langauge of developer
    void printProgramming(){
        System.out.println("Developer programming langauge: "+programming);
    }
}
