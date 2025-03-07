 class Parent {
    // Fields of the parent class
    int x = 20;
    String name = "parent class";
}

class PrintParentClass extends Parent {
    // Method to print the fields of the parent class using 'super'
    void printParentFields() {
        // Accessing parent class fields using 'super'
        System.out.println("Parent Field x: " + super.x);
        System.out.println("Parent Field name: " + super.name);
    }

    public static void main(String[] args) {
        // Creating an instance of the PrintParentClass (child class)
        PrintParentClass obj = new PrintParentClass();
        
        // Calling the method to print parent class fields
        obj.printParentFields();
    }
}
