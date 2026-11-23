/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package preguntas.quiz;

import java.util.Scanner;

/**
 *
 * @author jva2780
 */
public class Metodos {
    
    public String Primera_Pregunta(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pregunta 1: pregunta?");
        System.out.println("A: opcion 1\n B: Opcion 2\n C: Opcion 3\n D: Opcion 4\n");
        System.out.println("Seleccione su respuesta: ");
        
        String respuesta = sc.nextLine();
        respuesta = respuesta.toUpperCase();
        
        return respuesta;
    }
    
    
    public  
    
}
