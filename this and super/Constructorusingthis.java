class Constructorusingthis {

    // Constructor with no parameters
    Constructorusingthis() {
        // Calling another constructor of the current class using 'this()'
        this(5);  // Calls the constructor with one parameter
        System.out.println("This is the default constructor.");
    }

    // Constructor with one parameter
    Constructorusingthis(int x) {
        System.out.println("This is the constructor with parameter x = " + x);
    }

    public static void main(String[] args) {
        // Creating an instance of Constructorusingthis class
        // This will first invoke the default constructor, which will then invoke the parameterized constructor using 'this(5)'
        new Constructorusingthis();
    }
}


    