import java.util.Random;

public abstract class Pokemon implements AccionesCombate {

    protected listanombres nompoke;
    protected int lp;
    protected boolean vivo;

    protected Pokemon(listanombres nombre) {
        this.nompoke = nombre;
        this.vivo = true;
    }

    public listanombres getNompoke() {
        return nompoke;
    }

    public int getLp() {
        return lp;
    }

    public boolean isVivo() {
        return vivo;
    }

    @Override
    public int atacar() {
        Random r = new Random();
        int fuerza = r.nextInt(11); 
        System.out.println(nompoke + " ataca con fuerza " + fuerza);
        return fuerza;
    }

    

        System.out.print(nompoke + " " + lp + " LP ");
}