import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();

        for (int i = numero; i < numero + 12; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }


        scanner.close();
    }
}
