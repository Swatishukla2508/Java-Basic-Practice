import java.util.Scanner;

public class Cfch8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first number f");
        int f = scanner.nextInt();
        System.out.println("enter the second number g");
        int g = scanner.nextInt();

        System.out.println("---- MENU ----");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your choice:");
        // int choice = scanner.nextInt(); // ✅ FIXED

        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Addition of two number " + (f + g));

                break;
            case 2:
                System.out.println("subtract two numberZ" + (f - g));
                break;
            case 3:
                System.out.println("multiply two number" + (f * g));
                break;
            case 4:
                System.out.println("divide two number" + (f / g));
                break;

            default:
                System.out.println("invalid choice");
                break;
        }
    }

}
