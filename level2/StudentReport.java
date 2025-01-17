// creating a class ,name as Student 
class Student{
    String name;
    int rollNo;
    double marks;
    
    // constructor
    Student(String name,int rollNo,double marks){
    this.name=name;
    this.rollNo=rollNo;
    this.marks=marks;
    }
    
    //method to display the student grade
    public static String StudentGrade(double marks){
        String grade="";
        // checking student  marks for giving grade.
        if(marks>=81 && marks<=100){
         return  grade="A";
        }
        else if(marks<=80 && marks<=60){
            return grade="B";
        }
        else 
        return grade ="c";
    }
    // method to display the student details.
    void displayDetails(){
    System.out.println("Student name: "+name);
    System.out.println("Student rollNumber: "+ rollNo);
    System.out.println("Student marks: "+marks);
    System.out.println("Student grade is: "+StudentGrade(marks)); 
    }
     }
    public class StudentReport{
    public static void main(String[]args){
    Student obj=new Student("Aman",28,88);
    Student obj1=new Student("rohan", 29, 83);
       obj.displayDetails();
       obj1.displayDetails();
        }
    }