import java.util.Scanner;
public class Exemple2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        
        // Demanar quant diners tens a la cartera
        System.out.print("Quanto dinero tienes en la cartera? ");
        double dineroCartera = lector.nextDouble();
        
        // Demanar el preu d'una entrada al cine
        System.out.print("Cuanto vale una entrada del cine? ");
        double valorEntrada = lector.nextDouble();
        
        // Demanar quantes entrades has comprat
        System.out.print("Cuantas entradas has comprado? ");
        int entradasCompradas = lector.nextInt();
        
        // Calcular el diners gastats
        double dineroGastado = valorEntrada * entradasCompradas;
        System.out.println("Te has gastado " + dineroGastado);
        
        // Calcular el diners que et queden
        double dineroRestante = dineroCartera - dineroGastado;
        System.out.println("Te queda este dinero para palomitas: " + dineroRestante + "€");
    }
}