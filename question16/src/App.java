import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        
        double povoA, povoB;
        
        System.out.println("Digite a população da nação A: ");
        povoA = scanner.nextDouble();
        System.out.println("Digite a população da nação B: ");
        povoB = scanner.nextDouble();
        int i;
        
        
        for(i = 0; povoA < povoB; i++){

           povoA+= povoA *=0.03;  //povoA = povoA + (povoA*0.03))
           povoB+= povoB *=0.015; //povoB = povoB + (povoB*0.03))
            
        }

        System.out.print(" " + i + " anos.");
        scanner.close();
        
    }
}
