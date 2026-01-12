package Objetos;

public abstract class Pokemon {

    protected String nombre;
    protected int lifePoints;
    protected boolean vivo;

    protected Pokemon(String nombre, int lp) {
        this.nombre = nombre;
        this.lifePoints = lp;
        this.vivo = true;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLifePoints() {
        return lifePoints;
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pokemon) {
            Pokemon p = (Pokemon) o;
            return this.nombre.equals(p.nombre);
        }
        return false;
    }
}
PokemonAgua.java
java
Copiar código
package Objetos;

public class PokemonAgua extends Pokemon {

    private int corassa = 3;

    public PokemonAgua() {
        super("Pikachu", 35);
    }

    public PokemonAgua(String nombre) {
        super(nombre, 35);
    }
}