class Parent {
    // Method in the parent class
    void show() {
        System.out.println("This is the parent class method.");
    }
}

class ThisandSuper extends Parent {

    // Method in the child class using 'this' to call another method of the current class
    void callThisMethod() {
        this.display(); // Using 'this' to call another method in the current class
    }

    // Another method in the child class
    void display() {
        System.out.println("This is the method in the child class.");
    }

    // Method in the child class using 'super' to call the parent class method
    void callSuperMethod() {
        super.show(); // Using 'super' to call the method from the parent class
    }

    public static void main(String[] args) {
        // Creating an instance of the child class
        ThisandSuper obj = new ThisandSuper();
        
        // Calling the methods
        obj.callThisMethod();  // Calls the method using 'this()'
        obj.callSuperMethod(); // Calls the method using 'super()'
    }
}
