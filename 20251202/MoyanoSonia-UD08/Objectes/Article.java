package Objectes;

public class Article {

private String nom;
private double preu;
private int IVA;
private int stock;

public Article (String nom, double preu, int IVA, int stock) {
boolean valid=true;
    if (nom==null){
        System.out.println("El nom no pot estar buit");
        valid=false;
    }
    if (preu<=0){
        System.out.println("El preu ha de ser major de 0");
        valid=false;
    }
    if (IVA!=21){
        System.out.println("L'IVA és incorrecte");
        valid=false;
    }
    if (stock<0){
        System.out.println("L'estòc ha de ser positiu");
        valid=false;
    }
    if (valid) {
            this.nom = nom;
            this.preu = preu;
            this.IVA = IVA;
            this.stock = stock;
        } else {
            System.out.println("L'article no s'ha pogut crear, hi ha alguna dada erronea");
        }
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
        if (nom != null) {
            this.nom = nom;
        } else {
            System.out.println("El nom no pot estar buit");
        }
    }
public void setPreu(double preu) {
        if (preu > 0) {
            this.preu = preu;
        } else {
            System.out.println("El preu ha de ser major de 0");
        }
    }
public void setIVA(int IVA) {
        if (IVA == 21) {
            this.IVA = IVA;
        } else {
            System.out.println("L'IVA només pot ser 21%");
        }
    }
public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("L'estòc ha de ser positiu");
        }
    }

public double getPVP() {
        return preu + (preu * IVA / 100);
    }
public double getPVPDescompte(int descompte) {
double preuDescompte= getPVP() * (1 - descompte / 100.0);

        return (preuDescompte);
    }

public boolean vendre(int quantitat) {
        if (quantitat > 0 && quantitat <= stock) {
            stock -= quantitat;
            return true;
        }
        System.out.println("Falta stock: " + quantitat+ " no disponible.");
        return false;
}

public boolean afegir(int quantitat) {
        if (quantitat > 0 ) {
            stock += quantitat;
            return true;
        }
        System.out.println("Quantitat erronea no es pot afegir a l'estòc.");
        return false;
}
public void imprimir() {
        System.out.println("- Article: "+nom);
        System.out.println("- Preu: "+preu+ " Euros" );
        System.out.println("- IVA: "+IVA+ "%" );
        System.out.println("- PVP: "+getPVP()+ " Euros" );
        System.out.println("- Stock: "+stock+ " unitats" );
    }
}
