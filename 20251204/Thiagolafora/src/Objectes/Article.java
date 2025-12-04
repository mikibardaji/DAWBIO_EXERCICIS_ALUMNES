package Objectes;

public class Article {

    private String nom;
    private double preu;
    private int IVA;
    private int stock;

    public Article(String nom, double preu, int IVA, int stock) {

        if (!validar(nom, preu, IVA, stock)) {
            System.out.println("No s'ha pogut crear l'article per dades incorrectes.");
            return;
        }

        this.nom = nom;
        this.preu = preu;
        this.IVA = IVA;
        this.stock = stock;
    }

    private boolean validar(String nom, double preu, int IVA, int stock) {
        boolean correcte = true;

        if (nom == null || nom.isEmpty()) {
            System.out.println("El nom és obligatori.");
            correcte = false;
        }
        if (preu <= 0) {
            System.out.println("El preu ha de ser superior a zero.");
            correcte = false;
        }
        if (!(IVA == 4 || IVA == 10 || IVA == 21)) {
            System.out.println("El tipus d'IVA no és vàlid.");
            correcte = false;
        }
        if (stock < 0) {
            System.out.println("El stock no pot ser negatiu.");
            correcte = false;
        }

        return correcte;
    }

    public String getNom() {
        return nom;
    }

    public double getPreu() {
        return preu;
    }

    public int getStock() {
        return stock;
    }

    public void setNom(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        } else {
            System.out.println("El nom introduït no és vàlid.");
        }
    }

    public void setPreu(double preu) {
        if (preu > 0) {
            this.preu = preu;
        } else {
            System.out.println("El preu ha de ser positiu.");
        }
    }

    public void setIVA(int IVA) {
        if (IVA == 4 || IVA == 10 || IVA == 21) {
            this.IVA = IVA;
        } else {
            System.out.println("Tipus d'IVA incorrecte (4, 10 o 21).");
        }
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock ha de ser zero o més.");
        }
    }

    public double getPVP() {
        return preu * (1 + IVA / 100.0);
    }

    public double getPVPDescompte(int descompte) {
        double pvp = getPVP();
        return pvp - (pvp * descompte / 100.0);
    }

    public boolean vendre(int quantitat) {
        if (quantitat > 0 && quantitat <= stock) {
            stock -= quantitat;
            return true;
        }
        System.out.println("No hi ha prou unitats disponibles.");
        return false;
    }

    public boolean afegir(int quantitat) {
        if (quantitat > 0) {
            stock += quantitat;
            return true;
        }
        System.out.println("La quantitat a afegir ha de ser positiva.");
        return false;
    }

    public void imprimir() {
        System.out.println("Article: " + nom);
        System.out.println("Preu base: " + preu + " €");
        System.out.println("IVA: " + IVA + "%");
        System.out.println("PVP: " + getPVP() + " €");
        System.out.println("Stock: " + stock + " unitats");
    }
}
