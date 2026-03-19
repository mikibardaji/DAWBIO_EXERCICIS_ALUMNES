        /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps;

/**
 *
 * @author thiag
 */
import java.util.LinkedHashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {

        Map<String, String> paquets = new LinkedHashMap<>();

        paquets.put("P01", "Monitor");
        paquets.put("P02", "Teclat");
        paquets.put("P03", "Ratolí");

        System.out.println("Llista de paquets:");
        for (String codi : paquets.keySet()) {
            System.out.println(codi + " -> " + paquets.get(codi));
        }

        System.out.println("Consulta P06:");
        if (!paquets.containsKey("P06")) {
            System.out.println("No hi ha producte");
        }
    }
}