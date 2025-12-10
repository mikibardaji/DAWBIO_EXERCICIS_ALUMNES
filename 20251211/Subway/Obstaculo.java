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
public class Obstaculo {
    // Attributes
    private String tipo; // Tren o barrera aleatoriamente -> boolean
    private int dificultad; // Perdida de energia: barrera 1-5 ; tren 5-10
    
    // Contructors
    public Obstaculo(){
        Random rand = new Random();
        
        // boolean esTren = rand.nextBoolean(); // -> true or false
        
        if(rand.nextBoolean()) this.tipo = "tren";
        else this.tipo = "barrera";
        
       if (this.tipo.equals("tren"))
           this.dificultad = rand.nextInt((10-5) + 1) + 5; // 5 - 10
       else
           this.dificultad = rand.nextInt(5) + 1; // 1 - 5
        
       System.out.println("Aparece un obstaculo: " +  this.tipo 
               + " (dificultad: " + this.dificultad +  ")");
    }
    private Obstaculo(boolean max){
        if(max){
            this.tipo = "tren";
            this.dificultad = 10;
        } else{
            System.out.println("Error: no se ha podido crear un obscacuro de dificultad máxima");
        }
    }
    
    // Methods 
    public static Obstaculo obstaculoMaximo() {
        Obstaculo obs = new Obstaculo (true);
        
        return obs;
    }
    
    // Getters 
    public int getDificultad() {
        return dificultad;
    }

    public String getTipo() {
        return tipo;
    }
    
}
