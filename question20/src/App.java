import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        String cidade;
        double renda, consumo_energetico, boleto_final = 0;
        System.out.println("Digite de acordo com sua cidade com letra MAIÚSCULA! ");
        System.out.println("S - Santa Ana");
        System.out.println("I - Industriários");
        System.out.println("T - Tabatinga");
        cidade = scanner.next();
    

        if(cidade.equals("S")){

            System.out.print("Digite sua renda mensal: R$ ");
            renda = scanner.nextDouble();
            System.out.print("Consumo energético mensal em reais: R$ ");
            consumo_energetico = scanner.nextDouble();

            if (renda > 50 && renda < 500) {
                boleto_final = consumo_energetico - 50;
            }
            else if(renda > 500 && renda < 1000){
                boleto_final = consumo_energetico - 25;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        else if(cidade.equals("I")){

            System.out.print("Digite sua renda mensal: R$ ");
            renda = scanner.nextDouble();
            System.out.print("Consumo energético mensal em reais: R$ ");
            consumo_energetico = scanner.nextDouble();

            if (renda > 240 && renda < 1000) {
                boleto_final = consumo_energetico - 240;
            }
            else if(renda > 1000 && renda < 5000){
                boleto_final = consumo_energetico - 120;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        else if(cidade.equals("T")){

            System.out.print("Digite sua renda mensal: R$ ");
            renda = scanner.nextDouble();
            System.out.print("Consumo energético mensal em reais: R$ ");
            consumo_energetico = scanner.nextDouble();

            if (renda > 5000 && renda < 10000) {
                boleto_final = consumo_energetico - 720;
            }
            else if(renda > 10000 && renda < 20000){
                boleto_final = consumo_energetico - 360;
            }
            else{
                System.out.println("Opção inválida!");
            }
        }
        else{
            System.out.println("Opção inválida!");
        }

        System.out.printf("R$ %.2f", boleto_final);
    }
}
