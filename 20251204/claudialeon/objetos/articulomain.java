package objetos;
import java.util.Scanner;

public class articulomain {
      public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);

    System.out.println("Introdueix les dades de l'article:");
        System.out.print("Nom: ");
        String nom = sc.nextLine();


        System.out.print("Preu sense iva: ");
        int preuSiniva = sc.nextInt();


        System.out.print("Preu amb iva: ");
        int preuiva = sc.nextInt();


        System.out.print("Unitats disponibles: ");
        int quantsQuedan = sc.nextInt();


    articulo a1= new articulo (nom, preuSiniva, preuiva, quantsQuedan);

        System.out.println();
        System.out.println("Article creat correctament.");
        System.out.println("Nom: " + a1.getNom());
        System.out.println("Preu sense IVA: " + a1.getPreuSiniva());
        System.out.println("IVA: " + a1.getIva() + "%");
        System.out.println("Unitats en estoc: " + a1.getQuantsQuedan());
    }
        
}



