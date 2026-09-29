import java.util.Scanner;

public class floatinttodouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the float value");
        System.out.println("enter the int value");

        float f = Float.parseFloat(scanner.nextLine());
        int n = scanner.nextInt();

        double d = (float) f;
        double a = (int) n;

        System.out.println("float value to doble" + d);

        System.out.println("int value to double" + a);
        scanner.close();

    }

}
