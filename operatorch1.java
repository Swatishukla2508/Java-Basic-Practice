import java.util.Scanner;

public class operatorch1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        short a = scanner.nextShort();
        System.out.println("enter the another number");
        short b = scanner.nextShort();

        short s = (short) (a + b);
        // short k=(a-b);
        short m = (short) (a * b);
        short d = (short) (a / b);
        if (a > b) {
            short k = (short) (a - b);
            System.out.println("Subtraction of two numbers is " + k);

        } else {
            System.out.println("wrong input");
        }
        System.out.println("asum of two number is" + s);
        // System.out.println("subtraction of two number is" + k);
        System.out.println("multiplication of two number is" + m);
        System.out.println("division of two number is" + d);

        scanner.close();

    }

}
