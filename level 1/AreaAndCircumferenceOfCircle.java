// create a class name as circle 
class Circle{
double radius;

// constructor
public Circle(double radius){
this.radius=radius;
}

// method to calculate area of circle 
public static double CalculateAreaOfCircle(double radius){
double pie=3.14;
return pie*(radius*radius);
}

// method to calculate circumference of circle
public static double CalculateCircumferenceOfCircle(double radius){
double pie=3.14;
return 2*pie*radius;
}

// display the result, area and circumference of circle.
void displayCircle(){
System.out.println("area of circle: "+ CalculateAreaOfCircle(radius));
System.out.println("circumeference of circle: "+ CalculateCircumferenceOfCircle(radius));
}
  }

public class AreaAndCircumferenceOfCircle{
public static void main(String[]args){
  // creating a object obj to access circle class.
Circle obj=new Circle(7);
obj.displayCircle();
    }
}