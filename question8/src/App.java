import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       Scanner scanner = new Scanner(System.in);

       double rendaPessoa1, rendaPessoa2, rendaConjunta, imposto, rendaLiquida;

       System.out.println("Digite a renda do integrante 1: ");
       rendaPessoa1 = scanner.nextDouble();
       System.out.println("Digite a renda do integrante 2: ");
       rendaPessoa2 = scanner.nextDouble();

       rendaConjunta = rendaPessoa1 + rendaPessoa2;

       if (rendaConjunta <= 900) {
        
            System.out.println("Renda Conjunta: " + rendaConjunta);
            System.out.println("Alícota Utilizada: ISENTO");
            System.out.println("Imposto de renda: 0");
            System.out.printf("Renda Líquida: %.2f" , rendaConjunta);
        
        }
        else if (rendaConjunta <= 1500) {
            
            imposto = rendaConjunta * 0.10;
            rendaLiquida = rendaConjunta - imposto;
            System.out.println("Renda Conjunta: " + rendaConjunta);
            System.out.println("Alícota Utilizada: 10%");
            System.out.println("Imposto de renda: " + imposto);
            System.out.println("Renda Líquida: " + rendaLiquida);

        }
        else if (rendaConjunta <= 2500) {
            
            imposto = rendaConjunta * 0.15;
            rendaLiquida = rendaConjunta - imposto;
            System.out.println("Renda Conjunta: " + rendaConjunta);
            System.out.println("Alícota Utilizada: 15%");
            System.out.println("Imposto de renda: " + imposto);
            System.out.println("Renda Líquida: " + rendaLiquida);

        }
        else{

            imposto = rendaConjunta * 0.25;
            rendaLiquida = rendaConjunta - imposto;
            System.out.println("Renda Conjunta: " + rendaConjunta);
            System.out.println("Alícota Utilizada: 25%");
            System.out.println("Imposto de renda: " + imposto);
            System.out.println("Renda Líquida: " + rendaLiquida);
        }

        scanner.close();

    }
}
