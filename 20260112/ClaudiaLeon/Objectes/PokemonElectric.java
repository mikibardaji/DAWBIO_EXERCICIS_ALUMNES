/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

import Objectes.PokemonAigua;
import Objectes.Pokemon;
import Objectes.LlistaNoms;

/**
 *
 * @author claud
 */
public final class PokemonElectric extends Pokemon {

    private int superAtac;

    public PokemonElectric() {
        super();
        this.life_Points = 40;
        this.superAtac = 2;
    }

    public PokemonElectric(LlistaNoms nombre) {
        super(nombre, 40);
        //this.life_Points = 40;
        this.superAtac = 2;
    }

    @Override
    public int atacar() {
        int base = super.atacar();
        int total = base + superAtac;
        superAtac++;
        return total;
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {
        int daño = atacante.atacar();

        if (atacante instanceof PokemonAigua) {
            daño *= 0.75;
        }

        life_Points -= daño;
        mostrarEstadoPokemon();
    }
}
