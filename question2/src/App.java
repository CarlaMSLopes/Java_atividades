import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int id, workedHours;
        double perHour, salary;

        System.out.println("Your ID: ");
        id = scanner.nextInt();
        System.out.println("How many hours did you work?");
        workedHours = scanner.nextInt();
        System.out.println("How much do you earn per hour?");
        perHour = scanner.nextDouble();

        salary = (perHour * workedHours);

        System.out.println("ID: " + id);
        System.out.printf("Salary: $ %.2f", salary);

        scanner.close();



    }
}
