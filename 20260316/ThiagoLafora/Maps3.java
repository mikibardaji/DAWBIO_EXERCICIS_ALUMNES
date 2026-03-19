/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maps;

/**
 *
 * @author thiag
 */
import java.util.*;

public class Maps3 {
    public static void main(String[] args) {

        List<String> fruites = Arrays.asList("poma", "platano" ,"poma", "poma", "pera", "poma", "pera", "kiwi");
        Map<String, Integer> comptador = new HashMap<>();

        for (String f : fruites) {
            if (comptador.containsKey(f)) {
                comptador.put(f, comptador.get(f) + 1);
            } else {
                comptador.put(f, 1);
            }
        }

        System.out.println("Comptador de fruites:");
        System.out.println(comptador);
    }
}
