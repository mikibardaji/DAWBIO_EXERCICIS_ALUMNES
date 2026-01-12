public final class Electrico extends Pokemon {

    private int superAtac = 2;


    public Electrico(listanombres nombre) {
        super(nombre);
        this.lp = 40;
    }

    @Override
    public int atacar() {
        int base = super.atacar();
        int total = base + superAtac;
        superAtac++;
        return total;
    }


        lp -= daño;
    }
}