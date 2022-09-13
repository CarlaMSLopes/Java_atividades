import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        double salario, salario_final;
        System.out.println("Digite seu salário: ");
        salario = scanner.nextDouble();

        if (salario > 500) {
            salario_final = salario + (salario * 0.10);
        }
        else if(salario > 300 && salario < 500) {
            salario_final = salario + (salario * 0.07);
        }
        else{
            salario_final = salario + (salario * 0.05);
        }

        System.out.printf("Seu novo salário é: R$ %.2f"  , salario_final);
        scanner.close();
    }
}
