import java.util.Scanner;

public class Cfch14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your marks");
        int m = scanner.nextInt();
        if (m <= 100 && m >= 90) {
            System.out.println("grade A");

        } else if (m <= 90 && m >= 80) {
            System.out.println("grade B");

        } else if (m <= 80 && m >= 70) {
            System.out.println("grade C");

        } else {
            System.out.println("pass");
        }
        scanner.close();
    }
}
