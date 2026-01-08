/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objetos;

/**
 *
 * @author jfo9565
 */
public abstract class Pokemon {
    protected final String nombre;
    protected int vida;
    protected boolean vivo;
    protected EnumPokemon

    public Pokemon(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public boolean isVivo() {
        return vivo;
    }
    
    public void pokemon(){
        
    }
    
}

