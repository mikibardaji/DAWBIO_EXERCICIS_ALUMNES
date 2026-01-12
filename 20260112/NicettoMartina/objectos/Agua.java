public class Agua extends Pokemon {

    private int corassa = 3;


    public Agua(listanombres nombre) {
        super(nombre);
        this.lp = 35;
    }

    @Override
    public void recibirImpacto(Pokemon atacante) {
        int daño = atacante.atacar();

        lp -= daño;
    }
}