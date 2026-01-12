/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class PokemonVeri extends Pokemon{
    private boolean defensa;

    public PokemonVeri() {
        this(Nombres.Pikachu);
    }

    public PokemonVeri(Nombres nom) {
        super(nom, 50);
        this.defensa = false;
    }

    public boolean isDefensa() {
        return defensa;
    }

    @Override
    public String getCaracteristiquesEspecifiques() {
        return "Tipus: Verí, Defensa activa: " + defensa;
    }
 
    @Override
    public void recibirImpacto(Pokemon atacante) {
            int dany = atacante.atac();
        
        // Veneno recibe 75% de daño si el atacante es Eléctrico
        if (atacante instanceof PokemonElectric) {
            dany = (int)(dany * 0.75);
        }

        if (defensa) {
            dany = dany / 2;
            System.out.println(getNom() + " té la defensa activa! Dany reduït a la meitat.");
        }

        lifePoints -= dany;
        if (lifePoints <= 0) {
            lifePoints = 0;
            viu = false;
        } else if (lifePoints < 15 && !defensa) {
            defensa = true;
            System.out.println(getNom() + " ha activat la defensa!");
        }

        mostrarEstadoPokemon();
    }
}
