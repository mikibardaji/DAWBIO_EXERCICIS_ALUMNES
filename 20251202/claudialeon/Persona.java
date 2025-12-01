package objetos;

public class Persona {
    private String dni;
    private String nom;
    private String cognoms;
    private int edat;

    public Persona(String dni, String nom, String cognoms, int edat) {
        this.dni = dni;
        this.nom = nom;
        this.cognoms = cognoms;
        this.edat = edat;
}
    public String getDni() {
        return dni;
    }
    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public int getEdat() {
        return edat;
    }

    public void setDni(String nouDni) {
        dni = nouDni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    

    public void setEdat(int novaEdat) {
        edat = novaEdat;
    }

    public void mostrarPersona() {
        System.out.println(" / DNI " + dni + " / Nom: " + nom + " / Cognom: " + cognoms + " / edad: " + edat);
    }

    public boolean esJubilat() {
        return edat >= 65;
    }

    public boolean esMajorEdat() {
        return edat >= 18;
    }

    public int diferenciaEdat(Persona altre) {
        return Math.abs(edat - altre.edat);
    }
}

