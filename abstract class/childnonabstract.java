// Abstract class  
abstract class Animal {  
    // Abstract method (to be implemented by subclasses)  
    public abstract void makeSound();  

    // Non-abstract method (common behavior for all animals)  
    public void eat() {  
        System.out.println("Animal is eating.");  
    }  

    // Another non-abstract method  
    public void sleep() {  
        System.out.println("Animal is sleeping.");  
    }  
}  

// Subclass (concrete class) inheriting from Animal  
class Dog extends Animal {  

    // Implementing the abstract method from the Animal class  
    @Override  
    public void makeSound() {  
        System.out.println("Woof!");  
    }  

    // Method in the Dog class that creates an instance of Dog and calls non-abstract methods  
    public void demonstrateCallFromChild() {  
        Dog anotherDog = new Dog(); // Creating an instance of Dog within Dog  

        // Calling the non-abstract methods on the new instance:  
        anotherDog.eat();   // Output: Animal is eating.  
        anotherDog.sleep(); // Output: Animal is sleeping.  
    }  
}  

public class childnonabstract {  
    public static void main(String[] args) {  
        // Creating an object of the subclass (Dog) in the Main class  
        Dog myDog = new Dog();  

        // Calling the demonstrateCallFromChild method, which will create another Dog  
        // instance and call non-abstract methods on it.  
        myDog.demonstrateCallFromChild();  
    }  
}  
