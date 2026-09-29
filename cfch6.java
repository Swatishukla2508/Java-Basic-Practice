
import java.util.Scanner;

public class cfch6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks");
        int m = scanner.nextInt();

        if (m >= 90 && m <= 100) {
            System.out.println("A");
        } else if (m >= 80 && m < 90) {
            System.out.println("B");
        } else {
            System.out.println("fail");
        }

        scanner.close();
    }
}
