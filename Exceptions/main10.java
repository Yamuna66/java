public class main10 {
    public static void main(String[] args) {
        try {
            // Trying to load a class that does not exist
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            // Catch and print the ClassNotFoundException
            System.out.println("ClassNotFoundException: " + e.getMessage());
        }
    }
}
