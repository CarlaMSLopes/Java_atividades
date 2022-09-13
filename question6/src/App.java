import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        int kilometer;
        double litersOfGasoline, kilometersPerLiter;

        System.out.println("Quantos km pecorrido?");
        kilometer = scanner.nextInt();
        System.out.println("Quantos litros de gasolina usado:");
        litersOfGasoline = scanner.nextDouble();

        kilometersPerLiter = (kilometer / litersOfGasoline);

        System.out.printf("%.3f ", kilometersPerLiter);
        System.out.print("km/l");

        scanner.close();
    }
}
