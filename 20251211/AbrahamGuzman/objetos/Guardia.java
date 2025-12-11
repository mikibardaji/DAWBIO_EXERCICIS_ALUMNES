/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class Guardia {
    
    private final String nombre = "Ted Lutz"; 
    private int distanciaAcumulada; 

   
    public Guardia() {
        System.out.println("-> Constructor Guardia: El guardia " + nombre + " comienza la persecución.");
        this.distanciaAcumulada = 0;
    }

   
    public void correr() {
        this.distanciaAcumulada += 1;
        System.out.println("-> Método Guardia.correr(): " + this.nombre + " avanza. Distancia: " + this.distanciaAcumulada);
    }

    
    public boolean haAtrapadoA(int distanciaJugador) {
        System.out.println("-> Método Guardia.haAtrapadoA(): Distancia Jugador: " + distanciaJugador + 
                           ", Distancia Guardia: " + this.distanciaAcumulada);
        return this.distanciaAcumulada >= distanciaJugador;
    }

    
    public int getDistanciaAcumulada() {
        return distanciaAcumulada;
    }
}
