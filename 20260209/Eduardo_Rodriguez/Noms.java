package objetos;

public class Noms {

    private String nom;

    public Noms() {
        this.nom = null;
    }

    public Noms(String nom) {
        if (nom != null) {
            this.nom = nom.trim();
        } else {
            this.nom = null;
        }
    }

    public boolean estaBuit() {
        return nom == null || nom.isEmpty();
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        if (nom != null) {
            this.nom = nom.trim();
        } else {
            this.nom = null;
        }
    }

    public void esborrar() {
        this.nom = null;
    }

    public int getNumLletres() {
        if (estaBuit()) {
            return 0;
        }
        return nom.length();
    }

    @Override
    public String toString() {
        if (estaBuit()) {
            return "";
        }

        return nom.toUpperCase() + " (" + getNumLletres() + " lletres)";
    }
}
