import java.util.Scanner;

public class operatorch3 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner("System.in");
        // javac Scanner scanner = new Scanner("System.in");

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the dividend");
        System.out.println("enter the divisor");
        int d1 = scanner.nextInt();
        int d2 = scanner.nextInt();

        int r = d1 % d2;
        System.out.println("the remainder is" + r);
        scanner.close();

    }
}
