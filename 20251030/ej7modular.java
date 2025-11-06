import java.util.Scanner;
public class ej7modular {
    public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);

        boolean continuar = true;
        do{
            double preu = preguntapreu();
            double preuFinal = preuAmbIva(preu);
            mostrarResultat(preu, preuFinal);

            System.out.print("Vols introduir un altre article? (s/n): ");
            char resposta = sc.next().charAt(0);

            if (resposta == 'n' || resposta == 'N') {
                continuar = false;
                System.out.println("Fins aviat!");
            }
            else if (resposta != 'n' && resposta != 'N' && resposta != 's' && resposta != 'S'){
                System.out.println("Error");
                break;
            }

        } while (continuar);
}
 public static double preguntapreu() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introdueix el preu de l'article: ");
        double preu = sc.nextFloat();
        return preu;
    }

    public static double preuAmbIva(double preu) {
        double preuAmbIva = preu * 1.21;
        return preuAmbIva;
    }

    public static void mostrarResultat(double preu, double preuAmbIva) {
        System.out.println("Preu sense iva: " + preu + " euros.");
        System.out.println("Preu amb iva: " + preuAmbIva + " euros.");
        System.out.println("-------------------------");
    }
}
