/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author claud
 */
public class Amic {
    private String telefon;
    private String nom;
    private int edat;

    public Amic(String telefon, String nom, int edat) {
        this.telefon = telefon;
        this.nom = nom;
        this.edat = edat;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getEdat() {
        return edat;
    }

    public void setEdat(int edat) {
        this.edat = edat;
    }

    @Override
    public String toString() {
        return nom + " te el telefon " + telefon + " i te " + edat + " anys";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof Amic)) {
            return false;
        }
        final Amic other = (Amic) obj;
        return this.telefon.equals(other.telefon);
    }

}
