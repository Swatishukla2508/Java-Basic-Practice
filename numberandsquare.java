import java.util.Scanner;

public class numberandsquare {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        int s = n * n;
        System.out.println("square of the number is " + s);

        scanner.close();

    }

}
