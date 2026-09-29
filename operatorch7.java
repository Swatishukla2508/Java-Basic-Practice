
import java.util.Scanner;

public class operatorch7 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number a");
        int a = scanner.nextInt();

        System.out.println("enter the number b");
        int b = scanner.nextInt();

        System.out.println("enter the number c");
        int c = scanner.nextInt();

        if (a >= b && a >= c) {
            System.out.println("a is greatest");
        } else if (b >= a && b >= c) {
            System.out.println("b is greatest");
        } else {
            System.out.println("c is greatest");
        }

        scanner.close();
    }
}
