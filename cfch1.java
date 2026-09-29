import java.util.Scanner;

public class cfch1 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner"System.in");
        // scanner scanner = new scanner(system.in)
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the  number");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("the entered number is positive");

        } else {
            System.out.println("the entered number is negative");
        }
        scanner.close();
    }

}
