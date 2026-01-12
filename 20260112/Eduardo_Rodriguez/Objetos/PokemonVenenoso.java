package Objetos;

public final class PokemonVenenoso extends Pokemon {

    private boolean defensa = false;

    public PokemonVenenoso() {
        super("Pikachu", 50);
    }

    public PokemonVenenoso(String nombre) {
        super(nombre, 50);
    }
}
