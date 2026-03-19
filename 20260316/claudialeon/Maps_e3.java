/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package maps_e3;
import java.util.*;
/**
 *
 * @author claud
 */
public class Maps_e3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<String> fruites = Arrays.asList("poma", "pera", "poma", "platan", "poma", "pera");
        Map<String, Integer> comptador = new HashMap<>();
        
         for (String f : fruites) {
            if (comptador.containsKey(f)) {
                comptador.put(f, comptador.get(f) + 1);
            } else {
                comptador.put(f, 1);
            }
        }
        System.out.println(comptador);
    }
    
}
