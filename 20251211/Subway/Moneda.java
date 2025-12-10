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
public class Moneda {
    // Attributes
    private int valor; // Entero aleatorio 1 - 100
    
    // Constructors
    public Moneda(){
        Random rand = new Random();
        this.valor = rand.nextInt(100) + 1;
        System.out.println("Aparece una moneda de valor: " + this.valor);
    }
    
    // Methods
    public boolean hasPowerUp(){
        return this.valor % 3 == 0; // if(this.valor % 3 == 0) return true; return false;
    }
    
    // Getters
    public int getValor() {
        return valor;
    }
}
