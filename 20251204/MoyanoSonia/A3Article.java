public class A3Article {

    public static void main(String[] args) {

        // Carreguem articles
        Article a1 = new Article("Pijama", 10, 21, 50);
        Article a2 = new Article("Zapatos", 30, 10, 10);
        Article a3 = new Article("", -5, 200, -1); //article per provar els errors
        
        // Visualitzem els articles correctes
        System.out.println("=== Visualització Article 1 ===");
        a1.imprimir();
        System.out.println("=== Visualització Article 2 ===");
        a2.imprimir();
        
        
        //canviem preu i IVA i comprobem
        a1.setPreu(12.5);
        a1.setIVA(4);
        System.out.println("=== Actualització Article 1 ===");
        a1.imprimir();

        //canviem tipus d'IVA per probar l'error
        a1.setIVA(100);

        // comprobem una venda
        if (a2.vendre(5)){
            System.out.println("Venda realitzada.");
        }
        a2.imprimir();

        // Comprobem emmagatzamar 
        if (a2.afegir(20)){
            System.out.println("Afegit a l'estòc correctament.");
        }
            a2.imprimir();

        // PVP con descuento
        System.out.println("PVP amb 10% de descompte: " + a2.getPVPDescompte(10));
    }
}
