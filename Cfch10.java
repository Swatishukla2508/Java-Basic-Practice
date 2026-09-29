import java.util.Scanner;

public class Cfch10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the choice");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                System.out.println(" sunday");

                break;
            case 2:
                System.out.println("monday");
                break;
            case 3:
                System.out.println("tuesday");
                break;

            case 4:
                System.out.println("wednesday");
                break;

            case 5:
                System.out.println("thrusday");

                break;
            case 6:

                System.out.println("friday");

                break;

            case 7:
                System.out.println("saturday");
                break;
            default:
                System.out.println("invalid choice");
                break;
        }
    }

}
