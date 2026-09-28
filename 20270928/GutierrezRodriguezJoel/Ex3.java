

import java.util.Scanner;

public class Ex3 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Demanar quants euros tens
        System.out.print("Quants euros tens? ");
        double euros = lector.nextDouble();
        
        // Demanar el canvi de divisa
        System.out.print("Quin es el canvi de divisa? (1 euro = ? monedes noves) ");
        double canvi = lector.nextDouble();
        
        // Calcular les monedes noves
        double monedesNoves = euros * canvi;
        
        // Mostrar el resultat
        System.out.println("Amb els teus euros tindras " + monedesNoves + " monedes de la nova divisa");
    }
}