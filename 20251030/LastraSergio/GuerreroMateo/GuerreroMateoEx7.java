import java.util.Scanner;

public class GuerreroMateoEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean continuar = true;

        while (continuar) {
            System.out.print("Introdueix el preu del article: ");
            float preu = sc.nextFloat();

            float preuFinal = preuAmbIva(preu);
            System.out.println("Preu amb IVA (21%): " + preuFinal + " €");

            System.out.print("Vols introduir un altre preu? (s/n): ");
            String resposta = sc.next();

            if (resposta.equalsIgnoreCase("n")) {
                continuar = false;
                System.out.println("Programa finalitzat.");
            }
        }

        sc.close();
    }

    public static float preuAmbIva(float preu) {
        return preu * 1.21f;
    }
}
