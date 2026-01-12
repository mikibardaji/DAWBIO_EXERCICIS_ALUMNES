/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objetos;

/**
 *
 * @author xabiel
 */
public class PokemonAigua extends Pokemon{
    private int corassa;

    public PokemonAigua() {
        this(Nombres.Pikachu);
    }

    public PokemonAigua(Nombres nom) {
        super(nom, 35);
        this.corassa = 3;
    }

    public int getCorassa() {
        return corassa;
    }

    @Override
    public String getCaracteristiquesEspecifiques() {
        return "Tipus: Aigua, Corassa: " + corassa;
    }
  
     
    @Override
    public void recibirImpacto(Pokemon atacante) {
        int dany = atacante.atac();
        
        
        // Agua recibe 75% de daño si el atacante es Veneno
        if (atacante instanceof PokemonVeri) {
            dany = (int)(dany * 0.75);
        }

        if (corassa > 0) {
            corassa--;
            System.out.println(getNom() + " té corassa! No rep dany. Corassa restant: " + corassa);
        } else {
            lifePoints -= dany;
            if (lifePoints <= 0) {
                lifePoints = 0;
                viu = false;
            }
        }

        mostrarEstadoPokemon();
    }
}
