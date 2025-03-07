import java.lang.reflect.Method;

public class main14 {
    public static void main(String[] args) {
        try {
            // Get the class object of the Main class
            Class<?> clazz = Main.class;

            // Try to get a method that doesn't exist
            Method method = clazz.getMethod("nonExistentMethod");
        } catch (NoSuchMethodException e) {
            // Catch and print the NoSuchMethodException
            System.out.println("NoSuchMethodException: " + e.getMessage());
        }
    }

    // A sample method that exists
    public void existingMethod() {
        System.out.println("This method exists!");
    }
}
