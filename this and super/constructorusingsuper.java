class Parent {
    // Constructor of the parent class
    Parent() {
        System.out.println("This is the parent class constructor.");
    }
}

class Constructorusingsuper extends Parent {
    // Constructor of the child class
    Constructorusingsuper() {
        // Calling the parent class constructor using 'super()'
        super();  // This calls the parent class constructor
        System.out.println("This is the child class constructor.");
    }

    public static void main(String[] args) {
        // Creating an instance of the child class
        new Constructorusingsuper();
    }
}
