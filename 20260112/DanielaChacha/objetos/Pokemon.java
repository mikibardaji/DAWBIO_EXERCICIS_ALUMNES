package objetos;

import java.util.Random;

public abstract class Pokemon implements AccionesCombate {

    protected final LlistaNoms nom;
    protected int lp;
    protected boolean viu;
    protected Random random = new Random();

    protected Pokemon(int lpInicial) {
        this.nom = LlistaNoms.Pikachu;
        this.lp = lpInicial;
        this.viu = true;
    }

    protected Pokemon(LlistaNoms nom, int lpInicial) {
        this.nom = nom;
        this.lp = lpInicial;
        this.viu = true;
    }

    public LlistaNoms getNom() {
        return nom;
    }

    public int getLp() {
        return lp;
    }

    public boolean isViu() {
        return viu;
    }

    @Override
    public int atac() {
        int atac = random.nextInt(11);
        System.out.println(nom + " ataca amb força " + atac);
        return atac;
    }

    protected void mostrarEstatPokemon() {
        String estat = (lp > 0) ? "viu" : "mort";
        System.out.print(nom + " " + lp + " LP " + estat + " ");
        for (int i = 0; i < lp; i++) {
            System.out.print("=");
        }
        System.out.println();
    }
}
