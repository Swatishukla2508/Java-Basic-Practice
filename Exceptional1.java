import java.util.*;

public class Exceptional1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number a");
        int a = scanner.nextInt();

        System.out.println("Enter the number b");
        int b = scanner.nextInt();

        try {
            if (b == 0) {
                throw new ArithmeticException("Cannot divide by zero");
            }

            System.out.println("Result: " + (a / b));

        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } finally {
            System.out.println("Program executed");
        }

        scanner.close();
    }
}