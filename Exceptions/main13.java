import java.lang.reflect.Field;

class ExampleClass {
    // A sample class with a single field
    public String name;
}

public class main13 {
    public static void main(String[] args) {
        try {
            // Create an instance of ExampleClass
            ExampleClass example = new ExampleClass();

            // Attempt to access a field that does not exist
            Field field = example.getClass().getField("nonExistentField");
        } catch (NoSuchFieldException e) {
            // Catch the exception and print a message
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        }

        // Inform the user that the program has completed
        System.out.println("Program completed.");
    }
}

