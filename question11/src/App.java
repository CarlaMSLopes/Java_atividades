import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);

        int horaInicio, horaFim, horaTotal=0;
             
        System.out.println("Que horas começou a jogar? ");
        horaInicio = scanner.nextInt();
        
        if (horaInicio > 24) {
            System.out.println("Você digitou horário inválido!");
            System.out.println("Que horas começou a jogar? ");
            horaInicio = scanner.nextInt();
        }

        System.out.println("Que horas terminou? ");
        horaFim = scanner.nextInt();

        if (horaFim > 24) {
            System.out.println("Você digitou horário inválido!");
            System.out.println("Que horas terminou? ");
            horaInicio = scanner.nextInt();
        }

        if (horaInicio == 0 && horaFim ==0) {
            horaTotal = 24;
        }

        for(int i = horaInicio; i <= 24; i++){

           
            if(i == horaFim){
                
                  break;
            }else if(i==24){
                i=0;
            }
            
            horaTotal++;

        }
        
       
        
        System.out.println("Você jogou " + horaTotal);

        scanner.close();

    }
}
