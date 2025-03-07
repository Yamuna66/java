
public class static5 {  

    // Static variable  
    static int staticVariable = 10;  

    // Instance variable  
    int instanceVariable;  

    // Constructor  
    public static5(int instanceVariable) {  
        this.instanceVariable = instanceVariable;  
    }  

    // Static method  
    public static void staticMethod() {  
        System.out.println("Static method called. Static Variable: " + staticVariable);  
    }  

    // Instance method  
    public void instanceMethod() {  
        System.out.println("Instance method called. Instance Variable: " + instanceVariable);  
    }  

    public static void main(String[] args) {  
        // Calling the static method  
        static5.staticMethod(); // Call using the class name  

        // Creating an instance of the class  
        static5 obj = new static5(5);  

        // Calling the instance method  
        obj.instanceMethod(); // Call using the object reference  
    }  
}