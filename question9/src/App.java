
import java.util.Scanner;;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);
        int segundosTotais;

        System.out.println("Digite os segundos totais do evento: ");
        segundosTotais = scanner.nextInt();

        int hora = 0;
        int minuto = 0;
        int segundo = 0;

        int aux = segundosTotais;

        aux = segundosTotais / 60;

        if (aux > 60) {

            hora = aux / 60;
            minuto = aux % 60;

        }

        segundo = (segundosTotais) - (hora * 3600 + minuto * 60);

        System.out.print(hora);
        System.out.print(" : " + minuto);
        System.out.print(" : " + segundo);

    }
}
