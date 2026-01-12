/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class PokemonElectric extends Pokemon{

    private int superAtac;

    public PokemonElectric() {
        this(Nombres.Pikachu);
    }

    public PokemonElectric(Nombres nom) {
        super(nom, 40);
        this.superAtac = 2;
    }

    public int getSuperAtac() {
        return superAtac;
    }

    @Override
    public String getCaracteristiquesEspecifiques() {
        return "Tipus: Elèctric, Super Atac: " + superAtac;
    }

    @Override
    public int atac() {
        int forca = random.nextInt(11) + superAtac;
        System.out.println(getNom() + " ataca amb una força de " + forca + " (inclou +" + superAtac + " de super atac)");
        superAtac++;
        return forca;
    }
    @Override
    public void recibirImpacto(Pokemon atacante) {
         int dany = atacante.atac();
        
        // Eléctrico recibe 75% de daño si el atacante es Agua
        if (atacante instanceof PokemonAigua) {
            dany = (int)(dany * 0.75);
        }

        lifePoints -= dany;
        if (lifePoints <= 0) {
            lifePoints = 0;
            viu = false;
        }

        mostrarEstadoPokemon();
    }
}
