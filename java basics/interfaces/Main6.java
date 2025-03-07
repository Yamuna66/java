// Parent interface
interface Animal {
    void eat();
}

// Child interface inheriting from Animal
interface Dog extends Animal {
    void bark();
}

// Implementing class that implements Dog (must implement both methods)
class Puppy implements Dog {
    @Override
    public void eat() {
        System.out.println("The puppy is eating.");
    }

    @Override
    public void bark() {
        System.out.println("The puppy is barking.");
    }
}

// Main class to run the program
public class Main6{
    public static void main(String[] args) {
        Puppy myPuppy = new Puppy();
        myPuppy.eat();  // Calling the inherited method
        myPuppy.bark(); // Calling the child interface method
    }
}
