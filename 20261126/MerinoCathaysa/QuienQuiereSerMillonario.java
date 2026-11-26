/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package quienquieresermillonario;

import java.util.Scanner;

/**
 *
 * @author Cathy
 */
public class QuienQuiereSerMillonario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String respuesta1 = primeraPregunta();
        int puntos = respuestaPrimera(respuesta1);
        String respuesta2 = segundaPregunta();
        int puntos2 = respuestaSegunda(respuesta2);
        System.out.println("\n------------------------------");
        System.out.println("Puntuación final: " + (puntos + puntos2) + "/2");
        System.out.println("------------------------------");
        
    }
    
    public static String primeraPregunta(){
        
        Scanner sc = new Scanner(System.in);
        
        String respuesta;
        
        System.out.println("¿Qué tanto sabes de Shingeki no Kyojin?");
        System.out.println("¿Cuál es la muralla más exterior de Paradis? (Escribe la respuesta completa)");
        System.out.println("A. Muralla Rose");
        System.out.println("B. Muralla Sina");
        System.out.println("C. Muralla María");
        System.out.println("D. Muralla Shiganshina");
        respuesta = sc.nextLine().toUpperCase();
        
        return respuesta;
    }
    
    public static int respuestaPrimera(String respuesta) {
        
        
        respuesta = respuesta.trim().toUpperCase();
        
        switch (respuesta) {
            case "MURALLA MARIA":
            case "MURALLA MARÍA":
                System.out.println("¡¡CORRECTO!! Erwin estaría orgulloso de ti, entrega tu corazón, soldado.");
                return 1;
            case "MURALLA SINA":
                System.out.println("¡Incorrecto! Tú has ido directamente a esconderte con los nobles. ¡Muy valiente por tu parte...");
                return 0;
            case "MURALLA ROSE":
                System.out.println("¡Incorrecto! Sigue intentándolo, que los titanes ya han atravesado la primera muralla y tú todavía estás buscando cuál era.");
                return 0;
            case "MURALLA SHIGANSHINA":
                System.out.println("¡Incorrecto! Shiganshina es un distrito, no una muralla. ¡Con razón cayó tan rápido, si ni siquiera sabes qué estás defendiendo!");
                return 0;
            default:
                System.out.println("Respuesta no válida.");
                return 0;
        }
        
    }
    
    public static String segundaPregunta(){
        
        Scanner sc = new Scanner(System.in);
        
        String respuesta;
        
        System.out.println("\n------------------------------");
        System.out.println("¿Qué tanto sabes de Jujutsu Kaisen?");
        System.out.println("¿Qué alimento come Sukuna durante su enfrentamiento contra Mahoraga en Shibuya? (Escribe la respuesta completa)");
        System.out.println("A. Dorayakis");
        System.out.println("B. Palomitas");
        System.out.println("C. Takoyaki");
        System.out.println("D. Mochis");
        respuesta = sc.nextLine().toUpperCase();
        
        return respuesta;
    }
    
    public static int respuestaSegunda(String respuesta) {
        
        
        respuesta = respuesta.trim().toUpperCase();
        
        switch (respuesta) {
            case "DORAYAKIS":
                System.out.println("¡Incorrecto! ¡Que sea un monstruo no significa que se haya ido de merienda con Doraemon!");
                return 0;
            case "TAKOYAKI":
                System.out.println("¡Incorrecto! Sukuna estaba destruyendo Shibuya, no haciendo una ruta gastronómica por Japón.");
                return 0;
            case "MOCHIS":
                System.out.println("¡Incorrecto! ¡Como si Mahoraga fuese a esperar educadamente a que terminase el postre!");
                return 0;
            case "PALOMITAS":
                System.out.println("¡CORRECTO! Aunque parece que a Sukuna no le gustaron tanto como a Itadori, porque acabó escupiéndolas.");
                return 1;
            default:
                System.out.println("Respuesta no válida.");
                return 0;
        }
        
    }
}
