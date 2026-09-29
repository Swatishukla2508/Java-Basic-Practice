import java.util.Scanner;

public class operatorch2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the num");
        int a = scanner.nextInt();

        System.out.println("post decrement value" + (a--));
        System.out.println("post increment value" + (a++));
        System.out.println("pre decrement value" + (--a));
        System.out.println("pre increment value" + (++a));
        scanner.close();

    }
}
