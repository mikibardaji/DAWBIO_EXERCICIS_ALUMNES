/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps_e2;
import java.util.Map;
import java.util.TreeMap;
/**
 *
 * @author claud
 */
public class Maps_e2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Map<String, String> agenda = new TreeMap<>();
         
        agenda.put("Claudia", "111");
        agenda.put("Albert", "222");
        agenda.put("Alex", "333");
        
        System.out.println("Agenda:");
        for (String nom : agenda.keySet()) {
            System.out.println(nom + " - " + agenda.get(nom));
        }
         agenda.put("Albert", "999");
          System.out.println("Despres de modificar Albert:");
        for (String nom : agenda.keySet()) {
            System.out.println(nom + " - " + agenda.get(nom));
        }
    }
    
}
