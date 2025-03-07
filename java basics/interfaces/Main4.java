// Step 1: Define the first interface
interface Printer {
    void print();
}

// Step 2: Define the second interface with the same method signature
interface Scanner {
    void print(); // Same method signature as in Printer
}

// Step 3: Implement both interfaces in a single class
class Device implements Printer, Scanner {
    // Implement print() method for both interfaces
    @Override
    public void print() {
        System.out.println("Printing from Device.");
    }
    
    // Additional method to differentiate which interface's implementation is being called
    public void printerFunction() {
        Printer p = this; // Create an interface reference to Printer
        p.print(); // Calls the print method from Printer interface
    }

    public void scannerFunction() {
        Scanner s = this; // Create an interface reference to Scanner
        s.print(); // Calls the print method from Scanner interface
    }
}

// Step 4: Use the class in the main method
public class Main4 {
    public static void main(String[] args) {
        Device myDevice = new Device(); // Create an instance of Device

        // Call the print method directly
        myDevice.print(); // Output: Printing from Device.

        // Call the print method via Printer interface reference
        myDevice.printerFunction(); // Output: Printing from Device.

        // Call the print method via Scanner interface reference
        myDevice.scannerFunction(); // Output: Printing from Device.
    }
}

