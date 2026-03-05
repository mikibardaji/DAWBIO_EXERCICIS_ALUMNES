/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejamic;
import Objectes.Amic;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
/**
 *
 * @author claud
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        List<Amic> agenda;
        agenda = new ArrayList<>();

        int opcio;

        do {

            System.out.println("--- AGENDA D'AMICS ---");
            System.out.println("1.- Afegir Amic");
            System.out.println("2.- Llistar Amics");
            System.out.println("3.- Esborrar Amic");
            System.out.println("4.- Sortir");
            System.out.print("Escull una opcio: ");

           
        try {

                opcio = sc.nextInt();
                sc.nextLine();

                switch (opcio) {

                    case 1 -> {
                        System.out.println("Has triat Afegir Amic");
                        AfegirAmic(agenda, sc);
                    }

                    case 2 -> {
                        System.out.println("Has triat Llistar Amics");
                        LlistarAgenda(agenda);
                    }

                    case 3 -> {
                        System.out.println("Has triat Esborrar Amic");
                        EsborrarAmic(agenda, sc);
                    }

                    case 4 -> System.out.println("Adeu!");

                    default -> System.out.println("Opcio incorrecta");
                }

            } catch (InputMismatchException e) {

                System.out.println("ERROR: Has d'introduir un número sencer.");
                sc.nextLine();
                opcio = 0;

            }

        } while (opcio != 4);

        sc.close();
    }
    public static void AfegirAmic(List<Amic> agenda, Scanner sc) {

        System.out.println("Nom del teu amic:");
        String nom = sc.nextLine();

        System.out.println("Telefon del teu amic:");
        String telefon = sc.nextLine();

        System.out.println("Edat del teu amic:");
        int edat = sc.nextInt();
        sc.nextLine();

        agenda.add(new Amic(telefon, nom, edat));

    }

    public static void LlistarAgenda(List<Amic> agenda) {

        System.out.println("Amics a l'agenda: " + agenda.size());

        for (Amic a : agenda) {
            System.out.println(a);
        }

    }

    public static void EsborrarAmic(List<Amic> agenda, Scanner sc){   
    System.out.print("Introdueix el telefon de l'amic que vols esborrar: ");
    String telefon = sc.nextLine();

    Amic antic = new Amic(telefon, "", 0);

    if (agenda.remove(antic))
        System.out.println("Borrant amic");
    else
        System.out.println("No existeix aquest amic");
    }


}
