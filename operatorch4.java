import java.util.Scanner;

public class operatorch4 {
    public static void main(String[] args) {
        // Scanner scanner=new Scanner("System.in");
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scanner.nextInt();
        System.out.println("enter the another number");
        int n2 = scanner.nextInt();
        int a1 = (n += n2);
        int a2 = (n -= n2);

        System.out.println("add and assign value" + a1);
        System.out.println("sub and assign value" + a2);
        scanner.close();

    }

}
