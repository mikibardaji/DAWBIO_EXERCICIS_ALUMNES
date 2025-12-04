import Objectes.Article;

public class ArticleMain {

    public static void main(String[] args) {

       
        Article a1 = new Article("Pijama", 10, 21, 50);
        Article a2 = new Article("Zapatos", 30, 10, 10);
        Article a3 = new Article("", -5, 200, -1); 

        
        System.out.println("--- Dades inicials de l'Article 1 ---");
        a1.imprimir();

        System.out.println("--- Dades inicials de l'Article 2 ---");
        a2.imprimir();

        a1.setPreu(12.5);
        a1.setIVA(4);

        System.out.println("--- Article 1 després de canvis ---");
        a1.imprimir();

        a1.setIVA(100);

        System.out.println("Intentant vendre 5 unitats de l'Article 2...");
        if (a2.vendre(5)) {
            System.out.println("Venda completada correctament.");
        }
        a2.imprimir();

  
        System.out.println("Afegint estoc a l'Article 2...");
        if (a2.afegir(20)) {
            System.out.println("Estoc actualitzat.");
        }
        a2.imprimir();

        
        double pvpDescompte = a2.getPVPDescompte(10);
        System.out.println("PVP de l'Article 2 amb un 10% de descompte: " + pvpDescompte);
    }
}
