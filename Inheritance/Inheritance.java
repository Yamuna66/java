// Superclass A  
class A {  
    int data = 10; // Data member  

    public void methodA1() {  
        System.out.println("Method A1 from class A");  
    }  

    public void methodA2() {  
        System.out.println("Method A2 from class A");  
    }  

    public void overrideMethod() {  
        System.out.println("Override method from class A");  
    }  
}  

// Subclass B inheriting from A  
class B extends A {  
    int data = 20; // Hiding data member from A  

    public void methodB1() {  
        System.out.println("Method B1 from class B");  
    }  

    public void methodB2() {  
        System.out.println("Method B2 from class B");  
    }  

    @Override  
    public void overrideMethod() {  
        System.out.println("Override method from class B");  
    }  
}  

// Subclass C inheriting from B  
class C extends B {  
    int data = 30; // Hiding data member from B and A  

    public void methodC1() {  
        System.out.println("Method C1 from class C");  
    }  

    public void methodC2() {  
        System.out.println("Method C2 from class C");  
    }  

    @Override  
    public void overrideMethod() {  
        System.out.println("Override method from class C");  
    }  
}  

public class Inheritance {  
    public static void main(String[] args) {  
        // Creating objects for each class  
        A objA = new A();  
        B objB = new B();  
        C objC = new C();  

        // Calling methods of class A  
        System.out.println("Calling methods of class A:");  
        objA.methodA1();  
        objA.methodA2();  
        objA.overrideMethod(); // Calls A's version  
        System.out.println("Data member of A: " + objA.data);  

        // Calling methods of class B  
        System.out.println("\nCalling methods of class B:");  
        objB.methodA1(); // Inherited from A  
        objB.methodA2(); // Inherited from A  
        objB.methodB1();  
        objB.methodB2();  
        objB.overrideMethod(); // Calls B's version  
        System.out.println("Data member of B: " + objB.data); // Accessing B's data  

        // Calling methods of class C  
        System.out.println("\nCalling methods of class C:");  
        objC.methodA1(); // Inherited from A  
        objC.methodA2(); // Inherited from A  
        objC.methodB1(); // Inherited from B  
        objC.methodB2(); // Inherited from B  
        objC.methodC1();  
        objC.methodC2();  
        objC.overrideMethod(); // Calls C's version  
        System.out.println("Data member of C: " + objC.data); // Accessing C's data  

        // Runtime Polymorphism with overridden method  
        System.out.println("\nRuntime Polymorphism with overridden method:");  
        A refB = new B(); // Superclass reference to B object  
        A refC = new C(); // Superclass reference to C object  
        refB.overrideMethod(); // Calls B's version at runtime  
        refC.overrideMethod(); // Calls C's version at runtime  

        // Data members and Runtime Polymorphism  
        System.out.println("\nData members and Runtime Polymorphism:");  
        System.out.println("Data member accessed through A reference to B object: " + refB.data); // Accessing A's data  
        System.out.println("Data member accessed through A reference to C object: " + refC.data); // Accessing A's data  

        B refC2 = new C();  
         System.out.println("Data member accessed through B reference to C object: " + refC2.data); // Accessing B's data  
    }  
}  