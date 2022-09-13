import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
       
        Scanner scanner = new Scanner(System.in);
        String tipoEsqueleto, tipoAnimal, tipoAlimento, auxtipo = "";
        
        
        
        System.out.println("Digite se o animal é invertebrado ou vertebrado:");
        tipoEsqueleto = scanner.next();
        System.out.println("Digite qual classeele pertence: Ave, mamífero, inseto ou anelídeo?");
        tipoAnimal = scanner.next();
        System.out.println("Digite como se classifica sua alimentação: Carnívoro, herbívoro, hematofago ou onívoro?");
        tipoAlimento = scanner.next();

        if (tipoEsqueleto.equals("vertebrado")) {
            
            if (tipoAnimal.equals("ave")  && tipoAlimento.equals("carnivoro")) {                               
               auxtipo = "Águia";
            }
            else if (tipoAnimal.equals("ave") && tipoAlimento.equals("onivoro")){
                auxtipo = "Pomba";
            }
            else if (tipoAnimal.equals("mamifero") && tipoAlimento.equals("onivoro")) {
                auxtipo = "Homem";
            }
            else if(tipoAnimal.equals("mamifero") && tipoAlimento.equals("herbivoro")){
                auxtipo = "Vaca";
            }
        }
        else if (tipoEsqueleto.equals("invertebrado")){
           
            if (tipoAnimal.equals("inseto") && tipoAlimento.equals("hematofago")) {                               
                auxtipo = "Pulga";
             }
             else if (tipoAnimal.equals("inseto") && tipoAlimento.equals("herbivoro")){
                 auxtipo = "Lagarta";
             }
             else if (tipoAnimal.equals("anelideo") && tipoAlimento.equals("onivoro")) {
                 auxtipo = "Minhoca";
             }
             else if(tipoAnimal.equals("anelideo") && tipoAlimento.equals("hematofago")){
                 auxtipo = "Sanguessuga";
             }
        }

        System.out.println(auxtipo);
        
        scanner.close();

    }
}
