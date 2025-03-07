// Step 1: Define the interface with two methods
interface Vehicle {
    void start();          // Method to start the vehicle
    void stop();           // Method to stop the vehicle (not implemented)
}

// Step 2: Implement the interface in a class
class A implements Vehicle {

    @Override
    public void start() {
        System.out.println("The vehicle is starting.");
    }

    @Override
    public void stop() {
        System.out.println("The vehicle is stopping.");
    }
}


    // The stop method is not implemented in this class, so it remains unimplemented


// Step 3: Use the interface instance in the main method
public class Main1 {
    public static void main(String[] args) {
        // Create an instance of Car using the Vehicle interface
        Vehicle myCar = new A();
        
        // Call the implemented method
        myCar.start(); // Output: The car has started.

        // The following line would cause a compilation error because stop() isn't implemented:
        // myCar.stop(); // Uncommenting this line will cause an error
    }
}


