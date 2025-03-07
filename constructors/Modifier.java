class Modifier {  
    private int x;  

    
    private Modifier() {  
        this.x = 0;  
        System.out.println("Private constructor called");  
    }  

     
    Modifier(int x) {  
        this.x = x;  
        System.out.println("Default (package-private) constructor called with x = " + x);  
    }  

    
    protected Modifier(int x, String message) {  
        this.x = x;  
        System.out.println("Protected constructor called with x = " + x + " and message = " + message);  
    }  

     
    public Modifier(int x, String message, boolean flag) {  
        this.x = x;  
        System.out.println("Public constructor called with x = " + x + ", message = " + message + ", and flag = " + flag);  
    }  

    public int getX() {  
        return x;  
    }  

    public static void main(String[] args) {  
        
        Modifier obj1 = Modifier.createMyClass();  
        System.out.println("obj1.x = " + obj1.getX());  

         
        Modifier obj2 = new Modifier(10);  
        System.out.println("obj2.x = " + obj2.getX());  

        
        Modifier obj3 = new Modifier(20, "Protected message");  
        System.out.println("obj3.x = " + obj3.getX());  

        
        Modifier obj4 = new Modifier(30, "Public message", true);  
        System.out.println("obj4.x = " + obj4.getX());  
    }  

    
    private static Modifier createMyClass() {  
        return new Modifier();  
    }  
}  


class AnotherClass {  
    public static void main(String[] args) {  
         
        Modifier obj1 = new Modifier(5);  
        System.out.println("obj1.x from AnotherClass = " + obj1.getX());  

         
        Modifier obj2 = new Modifier(15, "Another protected message");  
        System.out.println("obj2.x from AnotherClass = " + obj2.getX());  

        
        Modifier obj3 = new Modifier(25, "Another public message", false);  
        System.out.println("obj3.x from AnotherClass = " + obj3.getX());  
    }  
}  


