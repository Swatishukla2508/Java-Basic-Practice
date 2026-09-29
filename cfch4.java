import java.util.Scanner;

public class cfch4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the year ");
        short s = scanner.nextShort();
        if (s % 4 == 0) {
            System.out.println("the year is leap year");

        } else {
            System.out.println("the year is not a leap year");
        }

        scanner.close();
    }
}
