// Abstract class  
abstract class Animal {  
    // Abstract method (to be implemented by subclasses)  
    public abstract void makeSound();  

    // Non-abstract method (common behavior for all animals)  
    public void eat() {  
        System.out.println("Animal is eating.");  
    }  
}  

// Subclass (concrete class) inheriting from Animal  
class Dog extends Animal {  

    // Implementing the abstract method from the Animal class  
    @Override  
    public void makeSound() {  
        System.out.println("Woof!");  
    }  

    // Method in the Dog class that creates an instance of Dog and calls makeSound  
    public void demonstrateCallFromChild() {  
        Dog anotherDog = new Dog(); // Creating an instance of Dog within Dog  
        anotherDog.makeSound(); // Calling the makeSound method on the new instance  
        anotherDog.eat(); //Calling the eat method  
    }  
}  

public class childabstract {  
    public static void main(String[] args) {  
        // Creating an object of the subclass (Dog) in the Main class  
        Dog myDog = new Dog();  

        // Calling the demonstrateCallFromChild method, which will create another Dog  
        // instance and call makeSound on it.  
        myDog.demonstrateCallFromChild(); // Output: Woof!  
                                             // Animal is eating.  
    }  
}  
