package pokemon;
public class PokemonAigua extends Pokemon {

    private int corassa;

    public PokemonAigua() {
        super();
        this.life_Points = 35;
        this.corassa = 3;
    }

    public PokemonAigua(LlistaNoms nombre) {
        super(nombre,35);
        this.corassa = 3;
    }

       @Override
    public void recibirImpacto(Pokemon atacante) {
        int daño = atacante.atacar();

        if (corassa > 0) {
            corassa--;
            daño = 0;
        }

        if (atacante instanceof PokemonVeri) {
            daño *= 0.75;
        }

        life_Points -= daño;
        mostrarEstadoPokemon();
    }
}
