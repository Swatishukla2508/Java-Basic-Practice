import java.util.Scanner;

class Bankaccount {

    int Bankaccount;
    double withdrawl;
    double balance;
    double deposit;

    void Bankaccount1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the bankaccount number");

        Bankaccount = scanner.nextInt();
    }

    void Bankaccount2(double withdrawl,
            double balance,
            double deposit) {

        this.withdrawl = withdrawl;
        this.balance = balance;
        this.deposit = deposit;
    }

    void withdrawl() {

        if (balance < withdrawl) {

            System.out.println("Not Applicable");

        } else {

            balance = balance - withdrawl;

            System.out.println(withdrawl + " withdrawn");
        }
    }

    void balance() {

        System.out.println("Present balance = " + balance);
    }

    void deposit() {

        balance = balance + deposit;

        System.out.println(deposit + " deposited");
    }
}

public class Practice1 {

    public static void main(String[] args) {

        Bankaccount B1 = new Bankaccount();

        B1.Bankaccount1();

        B1.Bankaccount2(2500, 100000, 500);

        B1.deposit();

        B1.withdrawl();

        B1.balance();
    }
}