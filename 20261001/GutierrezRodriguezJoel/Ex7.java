

import java.util.Scanner;

public class Ex7 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Factor de conversió constant
        final double MILLES_A_METRES = 1852;
        
        // Llegir la distància en milles nàutiques
        System.out.print("Entra la distància en milles nàutiques: ");
        double milles = lector.nextDouble();
        
        // Calcular la conversió a metres
        double metres = milles * MILLES_A_METRES;
        
        // Mostrar el resultat
        System.out.println(milles + " milles nàutiques equivalen a " + metres + " metres");
    }
}
