import java.util.Scanner;

public class nameagesalary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your name");
        System.out.println("enter the age");
        System.out.println("enter the salary");

        // String s = scanner.nextLine();
        // byte a = scanner.nextLine();
        // short r = scanner.nextLine();
        String s = scanner.nextLine();
        byte a = scanner.nextByte();
        short r = scanner.nextShort();

        scanner.close();

    }

}
