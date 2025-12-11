/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

import java.util.Random;

/**
 *
 * @author xabiel
 */
public class Joc {
    // Atributos
    private final Jugador jugador;
    private final String nivelDificultad; 
    private final Guardia guardia; 
    
    
    private static final String NIVEL_FACIL = "facil";
    private static final String NIVEL_DIFICIL = "dificil";
    private static final int PROB_MONEDA_FACIL = 70; 
    private static final int PROB_MONEDA_DIFICIL = 30; 

    
    public Joc(String nombreJugador, String nivel) {
        System.out.println("\n--- INICIALIZANDO JUEGO ---");
        
        
        this.jugador = new Jugador(nombreJugador);
        this.guardia = new Guardia();
        
        String nivelLower = nivel.toLowerCase();
        if (nivelLower.equals(NIVEL_FACIL) || nivelLower.equals(NIVEL_DIFICIL)) {
            this.nivelDificultad = nivelLower;
        } else {
            this.nivelDificultad = NIVEL_FACIL; 
            System.out.println("¡AVISO! Nivel '" + nivel + "' no válido. Inicializado a nivel: " + NIVEL_FACIL);
        }
        
        System.out.println("Juego iniciado para " + this.jugador.getNombre() + 
                           " en nivel " + this.nivelDificultad.toUpperCase() + 
                           ". Energía inicial: " + this.jugador.getEnergia());
        System.out.println("---------------------------\n");
    }

   
    public void jugar() {
        System.out.println("\n*** COMIENZA LA PARTIDA ***");
        
        
        while (this.jugador.estaVivo() && !this.guardia.haAtrapadoA(this.jugador.getDistanciaAcumulada())) {
            
            System.out.println("\n--- TURNO: Distancia: " + this.jugador.getDistanciaAcumulada() + 
                               "m, Puntuación: " + this.jugador.getPuntuacion() + 
                               ", Energía: " + this.jugador.getEnergia() + 
                               ", Power-Up: " + (this.jugador.isPowerUpActivo() ? "SI" : "NO") + " ---");
            
            
            this.jugador.correr();

          
            this.guardia.correr();
            
            
            interactuar();
        }

        // Al finalizar
        System.out.println("\n*** FIN DE LA PARTIDA ***");
        if (this.guardia.haAtrapadoA(this.jugador.getDistanciaAcumulada())) {
            System.out.println("¡GAME OVER! " + this.jugador.getNombre() + " ha sido atrapado por " + this.guardia.getNombre() + ".");
        } else {
             System.out.println("¡GAME OVER! " + this.jugador.getNombre() + " se ha quedado sin energía.");
        }
        
        System.out.println("\n--- RESULTADOS FINALES ---");
        System.out.println("Distancia Total Recorrida: " + this.jugador.getDistanciaAcumulada() + " metros");
        System.out.println("Puntuación Final (Monedas): " + this.jugador.getPuntuacion() + " puntos");
        System.out.println("--------------------------");
    }
    
   
    private void interactuar() {
        System.out.println("-> Método Juego.interactuar(): Verificando encuentro...");
        Random rand = new Random();
        int probMoneda = (nivelDificultad.equals(NIVEL_FACIL)) ? PROB_MONEDA_FACIL : PROB_MONEDA_DIFICIL;
        
        // Generar un número aleatorio entre 1 y 100
        if (rand.nextInt(100) < probMoneda) {
            // El jugador se encuentra una Moneda
            Monedas nuevaMoneda = new Monedas();
            this.jugador.recogerMoneda(nuevaMoneda);
            
        } else {
           
            Obstaculos nuevoObstaculo = crearObstaculoSegunDificultad();
            this.jugador.chocar(nuevoObstaculo);
        }
    }
    
   
    private Obstaculos crearObstaculoSegunDificultad() {
         System.out.println("-> Método privado crearObstaculoSegunDificultad(): Creando obstáculo...");
        
         Random rand = new Random();
         if (nivelDificultad.equals(NIVEL_FACIL)) {
             // Opción Facil: 50% Barrera (1), 50% Tren (2)
             if (rand.nextInt(2) == 0) { // 0 o 1
                 // Crear una Barrera (usando el constructor por defecto de Obstaculo que elige al azar)
                 System.out.println("   Nivel FÁCIL: Generando Barrera o Tren (50/50).");
                 return new Obstaculos(); 
             } else {
                 // Crear un Tren
                 return new Obstaculos();
             }
         } else {
             // Opción Dificil: Se asume que genera un Obstáculo al azar (50/50 Barrera/Tren)
             System.out.println("   Nivel DIFÍCIL: Generando Barrera o Tren (50/50).");
             return new Obstaculos(); // El constructor de Obstaculo elige el tipo y la dificultad
         }
    }
}
