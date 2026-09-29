import java.util.Scanner;

public class operatorch6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number a");
        System.out.println("enter the number b");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        // if(a>=0&&b>=0){
        if (a >= 0 && b >= 0) {
            System.out.println("both values are positive");
        } else if (a >= 0 || b >= 0) {
            System.out.println("only one value is positive");
        } else {
            System.out.println("both values are negative");
        }

        scanner.close();
    }
}
