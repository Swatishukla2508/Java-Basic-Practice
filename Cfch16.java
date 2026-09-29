import java.util.Scanner;

public class Cfch16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("enter your month name");
        String m = scanner.nextLine().trim().toLowerCase();

        if (m.equals("january") || m.equals("march") || m.equals("may")
                || m.equals("july") || m.equals("august")
                || m.equals("october") || m.equals("december")) {

            System.out.println("this months have 31 days");

        } else if (m.equals("april") || m.equals("june")
                || m.equals("september") || m.equals("november")) {

            System.out.println("these months have 30 days");

        } else {
            System.out.println("this month is feb has 28 or 29 days");
        }

        scanner.close();
    }
}
