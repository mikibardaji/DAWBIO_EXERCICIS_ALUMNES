package pokemon;
import java.util.Random;

public abstract class Pokemon implements AccionsCombat{
    
    protected final LlistaNoms nom;
    protected int life_Points;
    protected boolean viu;

    protected Pokemon() {
        this.nom = LlistaNoms.Pikachu;
        this.viu = true;
    }

    protected Pokemon(LlistaNoms nombre, int life_Points) {
        this.nom = nombre;
        this.viu = true;
        this.life_Points = life_Points;
    }

  
    public LlistaNoms getNombre() {
        return nom;
    }

    public int getLifePoints() {
        return life_Points;
    }

    public boolean isVivo() {
        return viu;
    }

    
    @Override
    public int atacar() {
        Random r = new Random();
        int fuerza = r.nextInt(11);
        System.out.println(nom + " Ataca amb força: " + fuerza + "!");
        return fuerza;
    }

    
    protected void mostrarEstadoPokemon() {
        if (life_Points > 0) {
            System.out.print(nom + " <" + life_Points + "> LP viu ");
        } else {
            life_Points = 0;
            viu = false;
            System.out.print(nom + " 0 LP mort ");
        }

        for (int i = 0; i < life_Points; i++) {
            System.out.print("=");
        }
        System.out.println();
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Pokemon)) return false;
        Pokemon p = (Pokemon) obj;
        return this.nom == p.nom;
    }
}

