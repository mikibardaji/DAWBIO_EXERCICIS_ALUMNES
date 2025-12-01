package Objectes;

public class Persona {

    private String nom;
    private String cognoms;
    private String dni;
    private int edat;

    public Persona(String nom, String cognoms, String dni, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.edat = edat;
    }

    public String getNom() { return nom; }
    public String getCognoms() { return cognoms; }
    public String getDni() { return dni; }
    public int getEdat() { return edat; }

    public void setNom(String nouNom) { this.nom = nouNom; }
    public void setCognoms(String nousCognoms) { this.cognoms = nousCognoms; }
    public void setDni(String nouDni) { this.dni = nouDni; }
    public void setEdat(int novaEdat) { this.edat = novaEdat; }

    public void mostrarPersona() {
        System.out.println(nom + " " + cognoms + " | DNI: " + dni);
    }

    public boolean esMajorEdat() {
        if (edat >= 18) {
            System.out.println("És major d'edat");
            return true;
        } else {
            System.out.println("No és major d'edat");
            return false;
        }
    }

    public boolean esJubilat() {
        if (edat >= 65) {
            System.out.println("Està jubilat");
            return true;
        } else {
            System.out.println("No està jubilat");
            return false;
        }
    }

    public int diferenciaEdat(Persona altra) {
        return Math.abs(this.edat - altra.edat);
    }
}
