import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int num;
        String aux, index1, index2, index3, index4, index5, resultado = "";
        String[] vetor = new String[5];
        
        System.out.print("Digite um número com  5 digito: ");
        num = scanner.nextInt();

        aux = Integer.toString(num);
        vetor = aux.split("");

        index1 = vetor[4];
        index2 = vetor[3];
        index3 = vetor[2];
        index4 = vetor[1];
        index5 = vetor[0];

       if (index1.equals(index5)) {
        if (index2.equals(index4)) {
            if (index3.equals(index3)){
                resultado = "S";
            }
        }
        
       }
       else{
        resultado = "N";
       }
        
       
        System.out.println(resultado);
        
        scanner.close();
    }
}
