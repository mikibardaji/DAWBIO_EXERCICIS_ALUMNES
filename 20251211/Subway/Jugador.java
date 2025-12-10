/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelos;

/**
 *
 * @author chris
 */
public class Jugador {
    // Attributes 
    private String nombre;
    private int puntuacion;
    private int distancia_acumulada;
    private int energia;
    private boolean powerUp;
    
    // Constructors
    public Jugador(String nombre){
        this.nombre = nombre;
        this.puntuacion = 0;
        this.distancia_acumulada = 0; // 0 metros
        this.energia = 50;
        this.powerUp = false;
        System.out.println("Jugador creado: " + nombre
        + " con 50 de energía");
    }
    
    // Methods
    public void correr(){
        int metros = 0;  // Distancia en metros
        
        if(this.powerUp)
            metros = 2 * 3; // Corre tres veces
        else
            metros = 2; // Corre dos veces
        
        this.distancia_acumulada += metros;
        
        for(int i = 0; i < metros; i++)
            System.out.print("-");
        System.out.println("> " + metros + " | Metros totales recorridos: " + this.distancia_acumulada
        + " metros");
    }
    
    public void recogerMoneda(Moneda coin){
        this.puntuacion += coin.getValor();
        
        System.out.println("Has recogido una moneda de " + coin.getValor()
        + " puntos.");
        
        if(coin.hasPowerUp()) {
            this.powerUp = true;
            System.out.println("Power Up Activado. Ahora corres el triple.");
        }else{
            this.powerUp = false;
            System.out.println("Power Up Desactivado.");
        }
    }
    public void chocar(Obstaculo obs){
        this.energia -= obs.getDificultad(); // reducimos energia segun la difictad del obs
        this.powerUp = false;
        
        System.out.println("Te has chocado con un " + obs.getTipo() 
                + ". Pierdes " + obs.getDificultad() + " energía.");
        System.out.println("Energía restante: " + this.energia);
        System.out.println("Power Up Desactivado.");
    }
    
    // Getters
    public int getEnergia() {
        return energia;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public int getDistancia_acumulada() {
        return distancia_acumulada;
    }
    
    // Setter
    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    
}
