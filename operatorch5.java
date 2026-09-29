import java.util.Scanner;

public class operatorch5 {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner("System.in");
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the number");
        int n = scanner.nextInt();
        if (n % 2 == 0) {
            System.out.println("number is even");

        } else {
            System.out.println("number is odd");
        }

        scanner.close();
        // n%2;
        // System.out.println("number is even");

    }

}
