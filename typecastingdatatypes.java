import java.util.Scanner;

public class typecastingdatatypes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number in int");
        int n = scanner.nextInt();

        byte b = (byte) n;
        float f = (int) n;
        double d = (int) n;
        long l = (int) n;

        System.out.println("byte after casting" + b);
        System.out.println("double after casting" + d);
        System.out.println("float after casting" + f);
        System.out.println("long after casting" + l);

        scanner.close();

    }

}
