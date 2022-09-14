import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int ano_carro1, ano_carro2, ano_carro3, carro_mais_novo;
        double velocidade1, velocidade2, velocidade3, maior_velocidade;
        System.out.println("Digite o ano do carro 1: ");
        ano_carro1 = scanner.nextInt();
        System.out.println("Digite o ano do carro 2: ");
        ano_carro2 = scanner.nextInt();
        System.out.println("Digite o ano do carro 3: ");
        ano_carro3 = scanner.nextInt();

        System.out.println("Velocidade do carro 1: ");
        velocidade1 = scanner.nextDouble();
        System.out.println("Velocidade do carro 2: ");
        velocidade2 = scanner.nextDouble();
        System.out.println("Velocidade do carro 3: ");
        velocidade3 = scanner.nextDouble();

        carro_mais_novo = ano_carro3;
        if (ano_carro1 > carro_mais_novo || ano_carro2 > carro_mais_novo) {
            if (ano_carro1 > ano_carro2) {
                carro_mais_novo = ano_carro1;
            } else {
                carro_mais_novo = ano_carro2;
            }
        }
        maior_velocidade = velocidade3;
        if (velocidade1 > maior_velocidade || velocidade2 > maior_velocidade) {
            if (velocidade1 > velocidade2) {
                maior_velocidade = velocidade1;
            } else {
                maior_velocidade = velocidade2;
            }
        }

        System.out.println("Ano do carro mais novo: " + carro_mais_novo);
        System.out.println("Maior velocidade: " + maior_velocidade + " km/h");
        scanner.close();
       
    }
}
