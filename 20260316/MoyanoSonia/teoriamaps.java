/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teoriamaps;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 *
 * @author sorsh
 */
public class TeoriaMaps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       // 1. Creem el Map adequat segons la teoria (LinkedHashMap per mantenir l'ordre)
        Map<String, String> magatzem = new LinkedHashMap<>();

        // 2. Afegim els elements
        magatzem.put("P01", "Monitor");
        magatzem.put("P02", "Teclat");
        magatzem.put("P03", "Ratolí");

        // 3. Imprimim el Map ítem a ítem
        System.out.println("--- LLISTA DE PAQUETS ---");
        for (Map.Entry<String, String> entrada : magatzem.entrySet()) {
            System.out.println("Codi: " + entrada.getKey() + " | Producte: " + entrada.getValue());
        }

        // 4. Consulta del producte P06
        System.out.println("\n--- CONSULTA ---");
               
        if(magatzem.containsKey("P06")==false){
            System.out.println("No hi ha producte");
        }
            
    
    }
    
}
