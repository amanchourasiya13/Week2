class Person{
String name;
int age;
double height;

// default 
 Person(){
name="Rahul";
age=21;
height=144;
}
Person(String name,int age,double height){
  this.name=name;
  this.age=age;
  this.height=height;
}

// copy constructor
Person(Person previous){
this.name=previous.name;
this.age=previous.age;
this.height=previous.height;

}
// display detail 
void display(){
  System.out.println("Person name is : " +name);
  System.out.println("Person age is : " + age);
 System.out.println("Person height is : " + height);
 }
}
public class PersonDetail{
public static void main (String[]args){
System.out.println("default constructor: ");
Person p1=new Person();
p1.display();

System.out.println("parameterized constructor");
Person p2=new Person("aman",21,144);
p2.display();
System.out.println("copy constructor of reference parameterized constructor: ");
Person p3=new Person(p2);
p3.display();
    }
}