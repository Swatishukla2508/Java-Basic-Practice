import java.util.Scanner;

public class operatorch9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter the character");
        char ch = scanner.nextLine().charAt(0);
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("entered character is vowel");

        } else {
            System.out.println("the entered character is consonant");
        }

        // scanner.close();
    }

}
