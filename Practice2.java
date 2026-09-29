import java.util.Scanner;

class Employee {

    String name;
    int salaryDeveloper;
    int salaryManager;
    int id;
    int no;
    String type;

    void Employee1() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the employee id");
        id = scanner.nextInt();

        System.out.println("Enter the no of working days");
        no = scanner.nextInt();
        System.out.println("Enter the type of employee");
        type = scanner.next();
    }

    void Employee2(String name, int salaryDeveloper, int salaryManager) {

        this.name = name;
        this.salaryDeveloper = salaryDeveloper;
        this.salaryManager = salaryManager;
    }

    void display() {

        System.out.println("Employee name is " + name);
        if (type.equals("developer")) {
            int totalSalary = salaryDeveloper * no;
            System.out.println("Employee salary is " + totalSalary);
        } else if (type.equals("manager")) {
            int totalSalary = salaryManager * no;

            System.out.println("Employee salary is " + totalSalary);
        }
    }
}

public class Practice2 {

    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.Employee1();

        emp1.Employee2("John", 50000, 60000);

        emp1.display();
    }
}