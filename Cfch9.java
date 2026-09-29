import java.util.Scanner;

public class Cfch9 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner("System..in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your choice");
        char c = scanner.next().charAt(0);
        if (c >= '0' && c <= '9') {
            System.out.println("the choice is number");
        } else if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) {
            System.out.println("enter choice is alphabet");

        } else {
            System.out.println("enter choice is special character");
        }
        scanner.close();

    }

}
