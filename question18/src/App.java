import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        String aux;
        String[] vetor = new String[4];
        System.out.print("Digite um número com  4 digito: ");
        num = scanner.nextInt();

        aux = Integer.toString(num);
        vetor = aux.split("");

        
        
        System.out.println(vetor[3] + vetor [2] + vetor[1] + vetor[0]);
        
        scanner.close();
        

        


    }
}
