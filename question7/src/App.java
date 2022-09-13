import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);
        int value;
        int[] qtdNota = new int [7];
        
        int [] valorNota = new int [7];
        valorNota[0] = 100;
        valorNota[1] = 50;
        valorNota[2] = 20;
        valorNota[3] = 10;
        valorNota[4] = 5;
        valorNota[5] = 2;
        valorNota[6] = 1;

        System.out.println("Digite um valor: ");
        value = scanner.nextInt(); 
        int aux = value;

       
        for (int i = 0; aux > 0; i++ ) {
            
            qtdNota[i] = aux / valorNota[i];
            aux = aux % valorNota[i];

        }
        
        for (int i = 0; i < qtdNota.length; i++ ) {
            
            System.out.print("Notas de " + valorNota[i]);
            System.out.println(" : " + qtdNota[i]);
            
        }

        scanner.close();

    }
}
