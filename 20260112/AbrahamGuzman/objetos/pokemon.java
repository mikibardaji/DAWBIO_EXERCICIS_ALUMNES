/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
import java.util.Random;

public abstract class Pokemon implements AccionesCombate {
    private final LlistaNoms nom;
    protected int lifePoints;
    protected boolean viu;
    protected Random random;

    protected Pokemon(LlistaNoms nom, int lifePointsInicials) {
        this.nom = nom;
        this.lifePoints = lifePointsInicials;
        this.viu = true;
        this.random = new Random();
    }

    public LlistaNoms getNom() {
        return nom;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    public boolean isViu() {
        return viu;
    }

    public void mostrarDades() {
        System.out.println("Nom: " + nom + ", Life Points: " + lifePoints);
    }

    public abstract String getCaracteristiquesEspecifiques();

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Pokemon)) return false;
        Pokemon other = (Pokemon) obj;
        return this.nom == other.nom;
    }

    @Override
    public int atac() {
        int forca = random.nextInt(11);
        System.out.println(nom + " ataca amb una força de " + forca);
        return forca;
    }

    protected void mostrarEstadoPokemon() {
        String estat = lifePoints > 0 ? "viu" : "mort";
        String barraVida = "=".repeat(Math.max(0, lifePoints));
        System.out.println(nom + " " + lifePoints + " LP " + estat + " " + barraVida);
    }

    @Override
    public abstract void recibirImpacto(Pokemon atacante);

    protected int calcularDanyPerTipus(Pokemon atacante, int danyBase) {
        if ((atacante instanceof PokemonAigua && this instanceof PokemonElectric) ||
            (atacante instanceof PokemonElectric && this instanceof PokemonVeri) ||
            (atacante instanceof PokemonVeri && this instanceof PokemonAigua)) {
            return (int)(danyBase * 0.75);
        }
        return danyBase;
    }

    
    
}

