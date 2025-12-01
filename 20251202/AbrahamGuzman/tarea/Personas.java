/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;
import objetos.Persona;
/**
 *
 * @author agu3018
 */
public class Personas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona = new Persona(17485612, "Azucena", "Garcia", 17);
        
        persona.mostrarPersona(persona);
        System.out.println(persona.mayorEdad()); 
     
   
    }
    
}
