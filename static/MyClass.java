public class MyClass {  

    private String name;  

    public MyClass(String name) {  
        this.name = name;  
    }  

    public String getName() {  
        return this.name;  
    }  

    // Instance method  
    public void displayMessage() {  
        System.out.println("Hello from instance method! Name: " + this.name);  
    }  

    // Static method  
    public static void staticMethod() {  
        // 1. Create an instance of the class  
        MyClass myObject = new MyClass("Static Context Object");  

        // 2. Call the instance method using the object  
        myObject.displayMessage();  

        //3. call getName instance method to get the name  
        System.out.println("Name from instance method: " + myObject.getName());  
    }  

    public static void main(String[] args) {  
        // Calling the static method  
        MyClass.staticMethod();  
    }  
}