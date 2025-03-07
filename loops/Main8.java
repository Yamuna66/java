import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        int originalNumber = number;
        int sum = 0;
        
        // Find the number of digits
        int digits = 0;
        while (number != 0) {
            number /= 10; // Remove the last digit
            digits++;
        }

        number = originalNumber; // Restore the original number
        
        // Check if the number is an Armstrong number
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += Math.pow(digit, digits); // Raise the digit to the power of the number of digits
            number /= 10; // Remove the last digit
        }

        // Compare the sum with the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }
        
    }
}
