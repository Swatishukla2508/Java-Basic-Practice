import java.util.Scanner;

public class booleancheck {
   public static void main(String[] args) {

      /// Scanner scanner =new Scanner("System.in");
      Scanner scanner = new Scanner(System.in);

      System.out.println("enter the number a");
      System.out.println("enter the number b");

      int a = scanner.nextInt();
      int b = scanner.nextInt();
      if (a > b) {
         System.out.println("true");

      } else {
         System.out.println(false);

      }

      scanner.close();
      // System.out.println("true");

   }
}
