class Argumentconstructor {

    // Constructor with no parameters
    Argumentconstructor() {
        System.out.println("This is the default constructor.");
        // Calling the argument constructor using 'this()'
        this(20);  // Calls the constructor with one parameter
    }

    // Constructor with one argument
    Argumentconstructor(int x) {
        System.out.println("This is the constructor with parameter x = " + x);
    }

    public static void main(String[] args) {
        // Directly creating an instance of the class without using an explicit object reference
        new Argumentconstructor();  // This will call the default constructor, which in turn calls the argument constructor
    }
}
