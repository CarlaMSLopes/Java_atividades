import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
      
      Scanner scanner = new Scanner(System.in);
      int numero_input, i, aux = 0;
      
      System.out.println("Digite um número: ");
      numero_input = scanner.nextInt();

      for (i = 1; i <= numero_input; i++ ) {
          
        if (numero_input % i == 0) {
            aux++;
        }
      }
      
      if(aux <= 2){
        System.out.println(numero_input + " é primo!");
      }
      else{
        System.out.println(numero_input + " não é primo!");
      }

      scanner.close();

    
    }
}
