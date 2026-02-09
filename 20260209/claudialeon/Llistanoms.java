/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package llistanoms;
import Objectes.noms;
import java.util.Scanner;
/**
 *
 * @author claud
 */
public class Llistanoms {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        noms[] noms ={
            new noms("Anna"),
            new noms(),
            new noms("Marc"),
            new noms(),
            new noms("Laura"),
            new noms(),
            new noms("Pol"),
            new noms(),
            new noms("Júlia"),
            new noms()
        };
        
        for (int i = 0; i < noms.length; i++) {
            noms[i] = new noms();
        }

        char opcio;

        do {
            mostrarMenu();
            opcio = obtenirOpcio();

            switch (opcio) {
                case 'a':
                    llistarNoms(noms);
                    break;
                case 'b':
                    afegirNom(noms);
                    break;
                case 'c':
                    modificarNom(noms);
                    break;
                case 'd':
                    buscarNom(noms);
                    break;
                case 'e':
                    esborrarNom(noms);
                    break;
                case 'f':
                    System.out.println("Adeu!");
                    break;
                default:
                    System.out.println("Opcio incorrecta");
            }

        } while (opcio != 'f');
    }

    private static void mostrarMenu() {
        System.out.println("MENU");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom");
        System.out.println("c. Modificar nom");
        System.out.println("d. Buscar nom");
        System.out.println("e. Esborrar nom");
        System.out.println("f. Sortir");
    }

    private static char obtenirOpcio() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Escull una opcio: ");
        return sc.next().toLowerCase().charAt(0);
    }

    private static void llistarNoms(noms[] noms) {
        int comptador = 0;

        for (noms n : noms) {
            if (!n.estaBuit()) {
                System.out.println(n);
                comptador++;
            }
        }

        System.out.println("Total de noms: " + comptador);
    }

    private static void afegirNom(noms[] noms) {
        Scanner sc=new Scanner(System.in);
        
        sc.nextLine();
        System.out.print("Introdueix el nom: ");
        String text = sc.nextLine();

        for (noms n : noms) {
            if (n.estaBuit()) {
                n.setValor(text);
                System.out.println("Nom afegit correctament");
                return;
            }
        }

        System.out.println("La llista esta plena");
    }

    private static void modificarNom(noms[] noms) {
        Scanner sc=new Scanner(System.in);
        int pos = buscarPosicio(noms);

        if (pos == -1) {
            System.out.println("Nom no trobat");
            return;
        }

        sc.nextLine();
        System.out.print("Nou nom: ");
        noms[pos].setValor(sc.nextLine());

        System.out.println("Nom modificat");
    }

    private static void buscarNom(noms[] noms) {
        int pos = buscarPosicio(noms);

        if (pos == -1) {
            System.out.println("Nom no trobat");
        } else {
            System.out.println("Nom trobat a la posicio " + (pos + 1));
        }
    }

    private static void esborrarNom(noms[] noms) {
        int pos = buscarPosicio(noms);

        if (pos == -1) {
            System.out.println("Nom no trobat");
            return;
        }

        noms[pos].esborrar();
        System.out.println("Nom esborrat");
    }

    private static int buscarPosicio(noms[] noms) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Nom a buscar: ");
        String buscat = sc.nextLine();

        for (int i = 0; i < noms.length; i++) {
            if (!noms[i].estaBuit() &&
                noms[i].getValor().equalsIgnoreCase(buscat)) {
                return i;
            }
        }
        return -1;
    }

}
