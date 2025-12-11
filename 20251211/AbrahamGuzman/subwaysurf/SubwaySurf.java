/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package subwaysurf;

import objetos.Joc;

/**
 *
 * @author xabiel
 */
public class SubwaySurf {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("--- SIMULACIÓN DE SUBWAY SURFERS SIMPLIFICADO ---");
        
        // Ejemplo de uso: Iniciar un juego en nivel difícil
        Joc partidaDificil = new Joc("Jake", "dificil");
        partidaDificil.jugar();
        
        System.out.println("\n------------------------------------------------");
        // Ejemplo de uso: Iniciar otro juego en nivel fácil (con un nivel inválido para probar el default)
        Joc partidaFacil = new Joc("Tricky", "cualquiercosa"); // Debería inicializarse a 'facil'
        partidaFacil.jugar();
    
    }
    
}
