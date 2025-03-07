// Class with overloaded methods
class Calculator {

    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}

// Main class to run the program
public class main2 {
    public static void main(String[] args) {
        // Create an instance of Calculator
        Calculator calc = new Calculator();

        // Call the method to add two integers
        System.out.println("Sum of 3 and 4 (int): " + calc.add(3, 4));

        // Call the overloaded method to add two double values
        System.out.println("Sum of 3.5 and 4.5 (double): " + calc.add(3.5, 4.5));

        // Call the overloaded method to add three integers
        System.out.println("Sum of 1, 2, and 3 (int): " + calc.add(1, 2, 3));
    }
}
