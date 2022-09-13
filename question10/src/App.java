import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        int dia, mes, ano, diasDeVida;
        System.out.println("Digite dias de vida: ");
        diasDeVida = scanner.nextInt();

        ano = diasDeVida / 365;
        mes = (diasDeVida % 365) / 30;
        dia = ((diasDeVida % 365) % 30);
       
       

        System.out.print(ano);
        System.out.println(" ano(s)");
        System.out.print(mes);
        System.out.println(" mes(es)");
        System.out.print(dia);
        System.out.println(" dia(s)");

    }
}
