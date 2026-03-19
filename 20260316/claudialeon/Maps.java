/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps;
import java.util.LinkedHashMap;
import java.util.Map;
/**
 *
 * @author claud
 */
public class Maps {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Map<String, String> paquets = new LinkedHashMap<>();
        
        paquets.put("P1", "Monitor");
        paquets.put("P2", "Teclat");
        paquets.put("P3", "Ratolí");
        
         System.out.println("Llista de paquets:");
        for (String codi : paquets.keySet()) {
            System.out.println(codi + " -> " + paquets.get(codi));
        }
        
        System.out.println("Consulta P6:");
        if (!paquets.containsKey("P6")) {
            System.out.println("No hi ha producte");
        }
    }
        
    
}
