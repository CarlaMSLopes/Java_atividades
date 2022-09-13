import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
    Scanner scanner = new Scanner(System.in);
    
    int numero, n1 = 0, n2 =1, sequencia = 0;
    System.out.println("Digite um número: ");
    numero = scanner.nextInt();

    for(int i = 0; i <= numero; i++){
        System.out.print(" " + sequencia);
        sequencia = n1 + n2;
        n1 = n2;
        n2 = sequencia;
        
        
    }


  
    scanner.close();
}
}
