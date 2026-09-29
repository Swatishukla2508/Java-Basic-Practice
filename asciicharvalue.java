import java.util.Scanner;

public class asciicharvalue {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the character");
        char c = scanner.next().charAt(0);
        int ascii = (int) c;

        System.out.println("ascii value of character=" + ascii);

        scanner.close();

    }

}
