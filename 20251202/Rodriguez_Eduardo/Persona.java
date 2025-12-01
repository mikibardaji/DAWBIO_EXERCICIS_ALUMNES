package Objectes;

public class Persona {

    private String nom, cognoms, dni;
    private int edat;

    public Persona(String nom, String cognoms, String dni, int edat) {
        this.nom = nom;
        this.cognoms = cognoms;
        this.dni = dni;
        this.edat = edat;
    }

    public String getNom() {
        return nom;
    }

    public String getCognoms() {
        return cognoms;
    }

    public String getDni() {
        return dni;
    }

    public int getEdat() {
        return edat;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCognoms(String cognoms) {
        this.cognoms = cognoms;
    }

    public void setDni(String dniNou) {
        dni = dniNou;
    }

    public void setEdat(int e) {
        edat = e;
    }

    public void mostrarPersona() {
        System.out.println(nom + " " + cognoms + " el DNI " + dni + " y la edad: " + edat);
    }

    public boolean esMajorEdat() {
        if (edat >= 18) {
            System.out.println("Mayor");
            return true;
        } else {
            System.out.println("No es mayor");
            return false;
        }
    }
}