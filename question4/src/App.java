import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3, highest, lowest;
        

        System.out.println("Type a number: ");
        number1 = scanner.nextInt();
        System.out.println("Type a number: ");
        number2 = scanner.nextInt();
        System.out.println("Type a number: ");
        number3 = scanner.nextInt();

        highest = number1;

        if (number2 > highest) 
        {
            highest = number2;
        }
        if (number3 > highest) 
        {
            highest = number3;
        }

        lowest = number1;
        if (number2 < lowest) 
        {
            lowest = number2;
        }
        if (number3 < lowest) 
        {
            lowest = number3;
        }

        System.out.println("Highest: " + highest );
        System.out.println("Lowest: " + lowest);

        scanner.close();
    }
}
