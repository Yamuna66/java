class Thiswithoutobject {
    // Fields of the class
    int x = 10;
    String name = "Java";

    // Constructor of the class
    Thiswithoutobject() {
        // Printing fields using 'this' keyword
        System.out.println("Field x: " + this.x);
        System.out.println("Field name: " + this.name);
    }

    // Main method (static method) - does not require an object to call the constructor
    public static void main(String[] args) {
        // Calling constructor without creating an object, using a static method to access fields
        new Thiswithoutobject();
    }
}
