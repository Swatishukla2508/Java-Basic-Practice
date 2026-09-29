import java.util.Scanner;

public class Cfch12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        // Scanner scanner = new Scanner(System.in);
        // Scanner scanner = new Scanner(System.in);

        if ((n % 3 == 0) && (n % 7 == 0)) {
            System.out.println(" the number is divisible by 3&7");

        } else {
            System.out.println("the enter is not divisible by 3&7");
        }
        scanner.close();
    }
}
