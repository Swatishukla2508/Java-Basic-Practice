import java.util.Scanner;

public class tempswap {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("number before swapping");
        System.out.println("enter the number a");
        int a = scanner.nextInt();
        System.out.println("enter the number b");
        int b = scanner.nextInt();

        // System.out.println("number after swapping");
        int temp = a;
        a = b;
        b = temp;
        System.out.println("number after swapping");
        System.out.println("value of A=" + a);
        System.out.println("value of B=" + b);

        scanner.close();
    }

}
