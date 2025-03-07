// Define an abstract class named 'Shape'  
abstract class Shape {  

    // Abstract method to calculate area (no implementation in the abstract class)  
    public abstract double calculateArea();  

    // Non-abstract method (concrete method) to display information about the shape  
    public void displayInfo() {  
        System.out.println("This is a shape.");  
    }  
}  

// Concrete class 'Circle' inheriting from 'Shape'  
class Circle extends Shape {  
    private double radius;  

    public Circle(double radius) {  
        this.radius = radius;  
    }  

    // Implementing the abstract method 'calculateArea' for the Circle class  
    @Override  
    public double calculateArea() {  
        return Math.PI * radius * radius;  
    }  
}  

// Concrete class 'Rectangle' inheriting from 'Shape'  
class Rectangle extends Shape {  
    private double length;  
    private double width;  

    public Rectangle(double length, double width) {  
        this.length = length;  
        this.width = width;  
    }  

    // Implementing the abstract method 'calculateArea' for the Rectangle class  
    @Override  
    public double calculateArea() {  
        return length * width;  
    }  
}  

// Main class to demonstrate the usage of abstract class and concrete classes  
public class AbstractClass {  
    public static void main(String[] args) {  
        // Creating instances of Circle and Rectangle  
        Circle circle = new Circle(5);  
        Rectangle rectangle = new Rectangle(4, 6);  

        // Calling methods on the Circle object  
        circle.displayInfo();  
        System.out.println("Area of the circle: " + circle.calculateArea());  

        // Calling methods on the Rectangle object  
        rectangle.displayInfo();  
        System.out.println("Area of the rectangle: " + rectangle.calculateArea());  
    }  
}  