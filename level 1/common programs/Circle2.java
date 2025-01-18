import java.util.Scanner;

class Circle {
    double radius;

    // Default constructor
    Circle() {
        radius=20;  // Calling the parameterized constructor with a default radius value of 1.0
    }

    // Parameterized constructor
    Circle(double radius) {
        this.radius = radius;  // Initializing radius with the user-provided value
    }

    // Method to calculate the area of the circle
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Method to display the circle's details
  public  void displayDetails() {
        System.out.println("Circle radius: " + radius);
        System.out.println("Area of the circle: " + calculateArea());
    }
    public double getradius(){
        return radius;
    }
}

public class Circle2{
    public static void main(String[] args) {
System.out.println("default construcotr: ");
     Circle c1=new Circle();
     c1.displayDetails();
        // Create a input object to read input
        Scanner input = new Scanner(System.in);

// parameterized constructor 
       System.out.println("parameterized constructor: ");
        // Take radius input from the user
        System.out.print("Enter the radius of the circle: ");
        double userRadius = input.nextDouble();

        // Creating a Circle object with the user-provided radius
        Circle c2 = new Circle(userRadius);

        // Displaying the circle's details
        c2.displayDetails();
        
        // Close the scanner
        input.close();
    }
}
