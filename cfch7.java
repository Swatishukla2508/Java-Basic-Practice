
import java.util.Scanner;

public class cfch7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the value of first side s1");
        int s1 = scanner.nextInt();

        System.out.println("enter the value of second side s2");
        int s2 = scanner.nextInt();

        System.out.println("enter the value of third side s3");
        int s3 = scanner.nextInt();

        if (s1 + s2 > s3 && s2 + s3 > s1 && s3 + s1 > s2) {
            System.out.println("triangle will form");
        } else {
            System.out.println("triangle will not form");
        }

        scanner.close();
    }
}
