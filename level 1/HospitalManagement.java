class Hospital{
    // static variable shared all patients.
    private static String hospitalName="Awadhshri Hospital";
    private static int totalPatients=0;
    private static int idCounter = 0; // Counter to generate unique IDs
    // instance variables.
    private  final int patientID;
    private String name;
    private  int age;
    private String ailment;
    Hospital(String name,int age,String ailment){
this.patientID=++idCounter;
    this.name=name;
    this.age=age;
    this.ailment=ailment;
    totalPatients++;
    }
    static void displayTotalPatients(){
        System.out.println(totalPatients);
    }
    void displayDetail(){
          if(this instanceof Hospital){
            System.out.println("Hospital name: "+hospitalName);
            System.out.println("patient id: "+patientID);
            System.out.println("Patient name: "+name);
            System.out.println("Patient age: "+age);
            System.out.println("Patient ailment: "+ailment);
            System.out.println();
        }
        else{
            System.out.println("The object is not an instance of Hospital");
        }
    }
       }
public class HospitalManagement {
    public static void main(String[] args) {
        Hospital h1=new Hospital("aman", 21, "cough");
        h1.displayDetail();
        Hospital h2=new Hospital("rahul", 12, "fever");
        h2.displayDetail();
    
    }
}
