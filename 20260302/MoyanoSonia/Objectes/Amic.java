/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objectes;

/**
 *
 * @author sorsh
 */
public class Amic {
     
    private int nCelda; //per cada entrada de l'agenda només un amic
    private String nom;
    private String telefon;

    public Amic(int nCelda, String nom, String telefon) {
        this.nCelda = nCelda;
        this.nom = nom;
        this.telefon = telefon;
    }

    public int getnCelda() {
        return nCelda;
    }

    public void setnCelda(int nCelda) {
        this.nCelda = nCelda;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return nCelda +": El telèfon de " + nom + " és " + telefon;
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
        return this.nCelda == other.nCelda;
    }
    
    
}   

