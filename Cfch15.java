import java.util.Scanner;

public class Cfch15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the value of b");
        int b = scanner.nextInt();
        System.out.println("enter the value of a");
        int a = scanner.nextInt();
        System.out.println("enter thevalue of c");
        int c = scanner.nextInt();

        int qd = (b * b - 4 * a * c);
        System.out.println("value of quadratic equation" + qd);

        scanner.close();
    }

}
