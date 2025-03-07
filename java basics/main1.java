class Car {
    // Method to display car details
    void displayCar(String brand, int year) {
        System.out.println("Car Brand: " + brand);
        System.out.println("Manufacturing Year: " + year);
    }
}

public class main1 {
    public static void main(String[] args) {
        // Creating an object of the Car class
        Car myCar = new Car();

        // Calling the method using the object
        myCar.displayCar("Toyota", 2022);
    }
}
