import java.util.Scanner;

public class Loop5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number j");
        int j = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {

            System.out.println(j + " x " + i + " = " + (j * i));

        }
    }

}
