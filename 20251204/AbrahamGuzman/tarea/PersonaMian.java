/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarea;

import objetos.Persona;

/**
 *
 * @author xabiel
 */
public class PersonaMian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("PRUEBA 1: DNI válido");
        Persona p1 = new Persona("12345678Z", "Juan", "Martínez", 20);

        if (p1.getDni() != null) { // solo si el DNI era válido
            p1.mostrarPersona();
            System.out.println("¿Es mayor de edad? " + p1.mayorEdad());
        }

        
        System.out.println("PRUEBA 2: DNI inválido");
        Persona p2 = new Persona("12A", "Pepe", "López", 16);

        if (p2.getDni() == null) {
            System.out.println("Objeto p2 NO se creó correctamente por DNI inválido");
        }


        System.out.println("PRUEBA 3: usar validarDNI sin crear persona");
        System.out.println("¿87654321A es válido? " + Persona.validarDNI("87654321A"));
        System.out.println("¿1234ABCD0 es válido? " + Persona.validarDNI("1234ABCD0"));


        System.out.println("FIN DE PRUEBAS");
    }
    
}
