/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maps;

/**
 *
 * @author thiag
 */
import java.util.Map;
import java.util.TreeMap;

public class Maps2 {
    public static void main(String[] args) {

        Map<String, String> agenda = new TreeMap<>();

        agenda.put("Zaira", "111");
        agenda.put("Albert", "222");
        agenda.put("Berta", "333");

        System.out.println("Agenda:");
        for (String nom : agenda.keySet()) {
            System.out.println(nom + " - " + agenda.get(nom));
        }

        agenda.put("Albert", "999");

        System.out.println("Després de modificar Albert:");
        for (String nom : agenda.keySet()) {
            System.out.println(nom + " - " + agenda.get(nom));
        }
    }
}
