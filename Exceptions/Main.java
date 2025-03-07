public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        // This will cause an ArithmeticException because division by zero is not allowed
        int result = num1 / num2;

        System.out.println("The result is: " + result);
    }
}
