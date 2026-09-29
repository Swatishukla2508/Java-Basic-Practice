import java.util.Scanner;

public class swapwithouttemp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number a");
        int a = scanner.nextInt();
        System.out.println("enter the number b");
        int b = scanner.nextInt();
        int c = a + b;
        b = c - b;
        a = c - a;
        System.out.println("number after swapping:");

        System.out.println("swap value of A" + a);
        System.out.println("swap value of B" + b);
        scanner.close();

    }

}
