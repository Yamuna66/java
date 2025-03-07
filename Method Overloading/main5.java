public class main5{

    // Method that takes an integer and returns an Integer object
    public Integer process(int number) {
        return number * 2; // Returns Integer
    }

    // Method that takes a double and returns a String
    public String process(double number) {
        return "Processed value: " + (number / 2); // Returns String
    }

    public static void main(String[] args) {
        main5 mo = new main5();

        // Call the method with an integer
        Integer intResult = mo.process(10);
        System.out.println("Integer result: " + intResult); // Output: Integer result: 20

        // Call the method with a double
        String stringResult = mo.process(10.0);
        System.out.println(stringResult); // Output: Processed value: 5.0
    }
}
