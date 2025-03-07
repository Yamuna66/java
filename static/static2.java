public class static2{  

    // Instance variables  
    int instanceVariable1;  
    String instanceVariable2;  

    // Constructor  
    public static2(int instanceVariable1, String instanceVariable2) {  
        this.instanceVariable1 = instanceVariable1;  
        this.instanceVariable2 = instanceVariable2;  
    }  

    // Static method that takes an object of the class as an argument  
    public static void printInstanceVariables(static2 obj) {  
        if (obj != null) { // Important: Check for null!  
            System.out.println("Instance Variable 1: " + obj.instanceVariable1);  
            System.out.println("Instance Variable 2: " + obj.instanceVariable2);  
        } else {  
            System.out.println("Object is null. Cannot print instance variables.");  
        }  
    }
}
    

