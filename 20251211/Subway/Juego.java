/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

import java.util.Random;

/**
 *
 * @author chris
 */
public class Juego {
    // Attributes
    private Jugador jugador;
    private String nivel; // ? 'facil' or 'dificil'
    private static final Random rand = new Random();
    
    // Constructors
    public Juego(String nombre, String nivel){
        this.jugador = new Jugador(nombre);
        
        if(!nivel.equalsIgnoreCase("facil") && !nivel.equalsIgnoreCase("dificil")){
            System.out.println("Nivel invalido. Se establece a 'facil'.");
            this.nivel = "facil";
        }else{
            this.nivel = nivel;
            this.nivel = nivel.toLowerCase(); // 
        }
        System.out.println("Juego iniciado en modo " + this.nivel);
    }
    
    // Methods
    public void jugar(){
        System.out.println("=== COMIENZA EL JUEGO ===");
        while(jugador.getEnergia() > 0){
            jugador.correr();
            
            boolean apareceMoneda;
            
            if(this.nivel.equals("facil")){
                apareceMoneda = rand.nextInt(100) < 70; // boolean op = < > <= >=      
            }else{
                apareceMoneda = rand.nextInt(100) < 30;
            }
            
            if(apareceMoneda){
                Moneda m = new Moneda();
                this.jugador.recogerMoneda(m);
            }else{
                Obstaculo obs = new Obstaculo();
                
                jugador.chocar(obs);
            }
            
            System.out.println("-----------------------------------");
        }
        System.out.println("=== FIN DEL JUEGO ===");
        System.out.println("Distancia recorrida: " + this.jugador.getDistancia_acumulada()
        + " metros.");
        System.out.println("Puntuación total: " + this.jugador.getPuntuacion());
        
    }
}
