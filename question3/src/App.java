import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String name;
        double salary, sales, commission, totalSalary;
        commission = 0.15;
        System.out.println("What is your name?");
        name = scanner.next();
        System.out.println("Your monthly salary: ");
        salary = scanner.nextDouble();
        System.out.println("Your sales: ");
        sales= scanner.nextDouble();

        totalSalary = (sales * commission) + salary;


        System.out.println("Name: " + name);
        System.out.printf("Salary: %.2f", totalSalary);

        scanner.close();
    }
}
