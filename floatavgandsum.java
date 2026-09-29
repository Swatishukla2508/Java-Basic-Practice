import java.util.Scanner;

public class floatavgandsum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the first float number");
        float f1 = Float.parseFloat(scanner.nextLine());

        System.out.println("enter the second float number");
        float f2 = Float.parseFloat(scanner.nextLine());

        float s = f1 + f2;
        float a = f1 + f2 / 2;

        System.out.println("average of float number is" + a);
        System.out.println("sum of float numbers is" + s);

        scanner.close();

    }

}
