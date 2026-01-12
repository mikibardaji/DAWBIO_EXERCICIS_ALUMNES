package Objetos;

public final class PokemonElectrico extends Pokemon {

    private int superAtac = 2;

    public PokemonElectrico() {
        super("Pikachu", 40);
    }

    public PokemonElectrico(String nombre) {
        super(nombre, 40);
    }
}
