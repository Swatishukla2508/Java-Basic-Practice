import java.util.Scanner;

public class usernameinput {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter your first name");
        String firstname = scanner.nextLine();
        System.out.println("enter your last name");
        String lastname = scanner.nextLine();

        scanner.close();

    }

}
