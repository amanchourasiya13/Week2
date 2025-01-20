class Student{
  static String universityName="Technocrats";
  private static int totalStudents=0;
 private String name;
 private  final int rollNumber;
private  String grade;

Student(String name,int rollNumber,String grade){
this.name=name;
this.rollNumber=rollNumber;
this.grade=grade;
totalStudents++;
}
// Static method to display the total number of students
public static void displayTotalStudents() {
    System.out.println("Total Students Enrolled: " + totalStudents);
}
  // Method to display student details
  public void displayStudentDetails() {
    if(this instanceof Student){
    System.out.println("University Name: " + universityName);
    System.out.println("Name: " + name);
    System.out.println("Roll Number: " + rollNumber);
    System.out.println("grade: "+grade);
    System.out.println();
}
else{
    System.out.println("this object is not instanceof product.");
}
  }
}
public class UniversityStudent {
    public static void main(String[] args) {
        Student s1=new Student("aman", 1234, "A");
        s1.displayStudentDetails();
        Student s2=new Student("rahul",234,"A+");
        s2.displayStudentDetails();

     Student.displayTotalStudents();
    }
}
