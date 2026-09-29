import java.util.Scanner;

public class cfch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("entered the number n");
        int n = scanner.nextInt();
        if (n % 5 == 0 || n % 11 == 0) {
            System.out.println("the number is divisible");

        } else {
            System.out.println("the entered number is not divisible");
        }
        scanner.close();
    }

}
