import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int number1, number2, number3, max, mid, min;

        System.out.println("Type a number: ");
        number1 = scanner.nextInt();
        System.out.println("Type a number: ");
        number2 = scanner.nextInt();
        System.out.println("Type a number: ");
        number3 = scanner.nextInt();

        max = number3;
        if (number1 > max || number2 > max) {
            if (number1 > number2) {
                max = number1;
            } else {
                max = number2;
            }
        }
        min = number3;
        if (number1 < min || number2 < min) {
            if (number1 < number2) {
                min = number1;
            } else {
                min = number2;
            }
        }

        mid = number1 + number2 + number3 - max - min;
        System.out.print("In order: " + min);
        System.out.print(", " + mid);
        System.out.print(", " + max);

        scanner.close();
    }
}
