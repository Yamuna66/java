// File: MyClass.java
class MyClass implements MyInterface {
    public void showMessage() { // Implementing the method
        System.out.println("Hello from MyClass!");
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.showMessage(); // Calling the implemented method
    }
}

