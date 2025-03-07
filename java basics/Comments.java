public class Comments { 
    public static void main(String[] args) {
        // Single-line comment: This prints a message to the console
        System.out.println("Hello, World!"); 

        /*
         Multi-line comment:
         The following code prints another message.
         It can be used to explain multiple lines of code.
        */
        System.out.println("Java Comments Example");

        /**
         * Documentation comment:
         * This function prints a greeting message.
         * It is mainly used for generating API documentation.
         */
        printGreeting();
    }

    /**
     * This method prints a greeting message.
     */
    public static void printGreeting() {
        System.out.println("Welcome to Java Programming!");
    }
}
