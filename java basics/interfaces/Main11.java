// File: MyClass.java
class Main11 implements MyInterface {
    public void showMessage() { // Implementing the method
        System.out.println("Hello from MyClass!");
    }

    public static void main(String[] args) {
        Main11 obj = new Main11();
        obj.showMessage(); // Calling the implemented method
    }
}



