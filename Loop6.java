import java.util.Scanner;

public class Loop6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // ✅ fixed

        System.out.println("Enter the number");
        int n = scanner.nextInt();

        if (n < 0) { // ✅ fixed condition
            System.out.println("Invalid input");
        } else {

            int f = 1; // ✅ result variable

            for (int i = 1; i <= n; i++) {
                f = f * i; // ✅ multiplication logic
            }

            System.out.println("Factorial = " + f); // ✅ print result
        }

        scanner.close();
    }
}
