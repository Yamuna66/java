public class static4 {  

    // Static variables  
    static int staticVariable1 = 10;  
    static String staticVariable2 = "Hello, Static!";  

    // Instance variable  
    int instanceVariable1;  

    // Constructor  
    public static4(int instanceVariable1) {  
        this.instanceVariable1 = instanceVariable1;  
    }  

    // Instance method that accesses static variables  
    public void printStaticVariables() {  
        System.out.println("From instance method - Static Variable 1: " + staticVariable1);  
        System.out.println("From instance method - Static Variable 2: " + staticVariable2);  
        System.out.println("Also accessing instance variable here: " + this.instanceVariable1); // Demonstrating access to instance variable as well  
    }  

    public static void main(String[] args) {  
        // Create an instance of the class  
        static4 obj = new static4(5);  

        // Call the instance method  
        obj.printStaticVariables();  

        //Accessing from another instance  
        static4 obj2 = new static4(20);  
        obj2.printStaticVariables();  

        //Demonstrating that changes to static variable affect all instances  
        staticVariable1 = 25;  
        obj.printStaticVariables(); //Will show 25 now  

    }  
}
