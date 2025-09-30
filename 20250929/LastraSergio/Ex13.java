import java.util.Scanner;

public class Ex13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double euros;
        double dolares;
        double libras;
        double Yens;
        double rublos;

        System.out.println("\n--- Menu de convercsion ---");
        System.out.println("Euros a Dolares (1 euro = 1.17 Dolares)");
        System.out.println("Euros a Libras (1 euro = 0.87 Libras)");
        System.out.println("Euros a Iens (1 euro = 174.27 Yens)");
        System.out.println("Euros a Rublos (1 euro = 97.39 Rublos)");

        System.out.print("Introdueix la quantitat en euros: ");
        euros = sc.nextDouble();

        System.out.println("Introdueix la moneda a la que vols convertir (Dolares(D), Libras(L), Yens(Y), Rublos(R)): ");
        char moneda = sc.next().charAt(0);

        dolares = euros * 1.17;
        libras = euros * 0.87;
        Yens = euros * 174.27;
        rublos = euros * 97.39;

        if (moneda == 'D' || moneda == 'd') 
        {

            dolares = euros * 1.17;
            System.out.printf("%.2f euros són %.2f Dolares.%n", euros, dolares);

        } 
        
        else if (moneda == 'L' || moneda == 'l') 
        {

            libras = euros * 0.87;
            System.out.printf("%.2f euros són %.2f Libras.%n", euros, libras);

        } 

        else if (moneda == 'Y' || moneda == 'y') 
        {

            Yens = euros * 174.27;
            System.out.printf("%.2f euros són %.2f Yens.%n", euros, Yens);

        } 

        else if (moneda == 'R' || moneda == 'r') 
        {

            rublos = euros * 97.39;
            System.out.printf("%.2f euros són %.2f Rublos.%n", euros, rublos);

        } 

        else 
        {

            System.out.println("Moneda no reconeguda. Si us plau, tria entre Dolares, Libras, Iens o Rublos.");

        }

        sc.close();
    }
}
