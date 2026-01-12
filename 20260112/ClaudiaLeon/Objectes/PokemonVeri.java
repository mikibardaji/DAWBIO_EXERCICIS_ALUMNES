/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import Objectes.PokemonElectric;
import Objectes.Pokemon;
import Objectes.LlistaNoms;

/**
 *
 * @author claud
 */
public final class PokemonVeri extends Pokemon {

    private boolean defensa = false;

    public PokemonVeri() {
        super();
        this.life_Points = 50;
        
    }

    public PokemonVeri(LlistaNoms nombre) {
        super(nombre,50);
        //this.life_Points = 50;
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {
        int daño = atacante.atacar();

        if (life_Points < 15) {
            defensa = true;
        }

        if (defensa) {
            daño /= 2;
        }

        if (atacante instanceof PokemonElectric) {
            daño *= 0.75;
        }

        life_Points -= daño;
        mostrarEstadoPokemon();
    }
}
