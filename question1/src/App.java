import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        double notaA, notaB, pesoA, pesoB, media;
        pesoA = 3.5;
        pesoB = 7.5;

        System.out.print("Nota A: ");
        notaA = scanner.nextDouble();

        System.out.print("Nota B: ");
        notaB = scanner.nextDouble();

        media = ((notaA * pesoA) + (notaB * pesoB )) / (pesoA + pesoB) ;

        System.out.print("Media : "+ media);
        
        scanner.close();
        
    }
}
