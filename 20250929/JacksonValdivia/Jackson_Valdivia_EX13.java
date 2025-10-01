
import java.util.Scanner;

public class conversion{
    public static void main(String[] args) {
        double euros;
        double euro_to_dolar = 1.17;
        double euro_to_LibraBritanica = 0.87;
        double euro_to_boliviano = 8.1;
        Scanner sc = new Scanner(System.in);

        System.out.println("Cuantos euros quiere convertir? ");
        euros = sc.nextDouble();

        System.out.println("A que moneda quiere convertir?\n Tenemos disponibles las siguientes monedas: ");
        System.out.println(" 1: dolar\n 2: Libra Britanica\n 3: Moneda Boliviana ");
        int respuesta = sc.nextInt();

        switch (respuesta) {
            case 3:
                System.out.println(euros + " euros son " + (euros * euro_to_boliviano) + " bolivianos");
                break;
            case 2:
                System.out.println(euros + " euros son " + (euros * euro_to_LibraBritanica) + " libras");
                break;
            case 1:
                System.out.println(euros + " euros son " + (euros * euro_to_dolar) + " dolares");
                break;
            default:
                throw new AssertionError();
        }
    }




}