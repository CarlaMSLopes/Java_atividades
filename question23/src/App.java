import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int x, y , resultado = 0;
        
        System.out.println("Digite um número: ");
        x = scanner.nextInt();
        System.out.println("Digite outro número: ");
        y = scanner.nextInt();

        System.out.println((x > y) ? resultado = 1 : "0");
       
        System.out.println((x == y) ? resultado = 1 : "0");

        System.out.println((x < y) ? resultado = 1 : "0");

        System.out.println((x != y) ? resultado = 1 : "0");

        System.out.println((x >= y) ? resultado = 1 : "0");

        System.out.println((x <= y) ? resultado = 1 : "0");

        scanner.close();
       
    }
}
