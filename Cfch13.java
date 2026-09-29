import java.util.Scanner;

public class Cfch13 {
    public static void main(String[] args) {
        // Scanner scanner = new Scanner('Systen.in');
        Scanner scanner = new Scanner(System.in);

        // 3. char c = scanner.nextchar.At(0);
        char c = scanner.next().charAt(0);

        if (c >= 'a' && c <= 'z') {

            System.out.println("the input is lower case");

            // System.out.println("the input is lower case");

        } else if (c >= 'A' && c >= 'Z') {
            System.out.println("the input is uppercase");
        } else {
            System.out.println("enter the correct input");
        }

        scanner.close();
    }
}
