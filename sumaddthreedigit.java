import java.util.Scanner;

public class sumaddthreedigit {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number a");
        System.out.println("enter the number b");
        System.out.println("enter the number c");

        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int sum = (a + b + c);
        System.out.println("sum of all number is=" + sum);
        scanner.close();

    }

}
