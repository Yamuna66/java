import java.util.Scanner;

public class Main4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the range (1 to N): ");
        int n = scanner.nextInt();

        System.out.println("\nEven Numbers:");
        for (int num = 1; num <= n; num++) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }

        System.out.println("\nOdd Numbers:");
        for (int num = 1; num <= n; num++) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }

        scanner.close();
    }
}
