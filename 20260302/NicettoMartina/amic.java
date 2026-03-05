public class amic {

    private String telefon;
    private String nom;
    private int edat;

    public amic(String telefon, String nom, int edat) {
        this.telefon = telefon;
        this.nom = nom;
        this.edat = edat;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getNom() {
        return nom;
    }

    public int getEdat() {
        return edat;
    }

    public String toString() {
        return "Nombre: " + nom + " | Telefono: " + telefon + " | Edad: " + edat;
    }
}