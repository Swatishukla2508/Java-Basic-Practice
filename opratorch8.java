import java.util.Scanner;

public class opratorch8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number x");
        int x = scanner.nextInt();
        int y = x++ * 2;

        System.out.println("the finaly valuue is" + y);
        scanner.close();
    }

}
