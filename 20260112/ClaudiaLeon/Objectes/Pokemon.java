/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;
import Objectes.LlistaNoms;
import Objectes.AccionsCombat;
import java.util.Random;
/**
 *
 * @author claud
 */
public abstract class Pokemon implements AccionsCombat{
    
    protected final LlistaNoms nom;
    protected int life_Points;
    protected boolean viu;

    protected Pokemon() {
        this.nom = LlistaNoms.Pikachu;
        this.viu = true;
    }

    protected Pokemon(LlistaNoms nombre, int life_Points) {
        this.nom = nombre;
        this.viu = true;
        this.life_Points = life_Points;
    }

  
    public LlistaNoms getNombre() {
        return nom;
    }

    public int getLifePoints() {
        return life_Points;
    }

    public boolean isViu() {
        return viu;
    }

    
    @Override 
    public int atacar() {
        Random rd = new Random();
        int fuerza = rd.nextInt(0,11);
        System.out.println(nom + " ataca amb força: " + fuerza + "!");
        return fuerza;
    }

    
    protected void mostrarEstadoPokemon() {
        if (life_Points > 0) {
            System.out.print(nom + " " + life_Points + " LP viu ");
        } else {
            life_Points = 0;
            viu = false;
            System.out.print(nom + " 0 LP mort ");
        }

        for (int i = 0; i < life_Points; i++) {
            System.out.print("#"); 
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pokemon)) return false;
        Pokemon p = (Pokemon) obj;
        return this.nom == p.nom;
    }
}

