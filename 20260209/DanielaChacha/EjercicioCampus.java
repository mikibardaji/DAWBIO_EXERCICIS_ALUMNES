import java.util.Scanner;
import objetos.Nom;

public class EjercicioCampus 
{
    public static void main(String[] args) 
    {
        char opcion;
        Nom llistaNoms [] = new Nom [10];

        for (int i = 0; i < llistaNoms.length; i++) 
        {
            llistaNoms[i] = new Nom(); 
        }

        do 
        {
            mostrarMenu();
            opcion = obtenirOpcioUsuari();

            switch (opcion) 
            {
                case 'a':
                    llistarNoms(llistaNoms);
                    break;
                case 'b':
                    afegirNom(llistaNoms);
                    break;
                case 'c':
                    modificarNom(llistaNoms);
                    break;
                case 'd':
                    cercarPosicio(llistaNoms);
                    break;
                case 'e':
                    esborrarNom(llistaNoms);
                    break;
                case 'f':
                    System.out.println("Sortint del programa...");
                    break;
                default:
                    System.out.println("Opció no vàlida.");
            }

        } while (opcion!='f');
    }

    private static void mostrarMenu() 
    {
        System.out.println("Menú:");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom");
        System.out.println("c. Modificar nom");
        System.out.println("d. Cerca en quina posició nom");
        System.out.println("e. Esborrar nom");
        System.out.println("f. Sortir");
        System.out.println("g. Opció a escollir, ficar nom");
    }

    private static char obtenirOpcioUsuari() 
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print ("Selecciona una opció: ");
        return scanner.next().charAt(0);
    }   

    private static void afegirNom(Nom [] llistaNoms) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println ("Introdueix quin nom vols afegir");
        String nomIntroducido=sc.nextLine().toUpperCase();
        int i=0;
        while(i < llistaNoms.length)
        {
            if (llistaNoms[i].isOcupat()==false)
            {
                llistaNoms[i].setNom(nomIntroducido);
                return;
            }
        i++;
        }
        System.out.println (nomIntroducido +"No s'ha pogut introduir, està tota la llista plena");
        return;
    }

    private static void llistarNoms(Nom[] llistaNoms)
    {
        int cont = 0;

        for (int i = 0; i < llistaNoms.length; i++)
        {
            if (llistaNoms[i].isOcupat())
            {
                System.out.println(llistaNoms[i].getNom().toUpperCase() + " (" + llistaNoms[i].getLlargNom() + " lletres)");
                cont++;
            }
        }
        System.out.println("Total de noms: " + cont);
    }

    private static void cercarPosicio(Nom[] llistaNoms)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom a cercar: ");
        String nomBuscat = sc.nextLine().toUpperCase();

        for (int i = 0; i < llistaNoms.length; i++)
        {
            if (llistaNoms[i].isOcupat() && llistaNoms[i].getNom().equals(nomBuscat))
            {
                System.out.println("El nom està a la posició: " + i);
                return;
            }
        }
        System.out.println("Nom no trobat.");
    }

    private static void esborrarNom(Nom[] llistaNoms)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom a esborrar: ");
        String nomBuscat = sc.nextLine().toUpperCase();

        for (int i = 0; i < llistaNoms.length; i++)
        {
            if (llistaNoms[i].isOcupat() && llistaNoms[i].getNom().equals(nomBuscat))
            {
                llistaNoms[i].setNomVacio();
                System.out.println("Nom esborrat.");
                return;
            }
        }
        System.out.println("Nom no trobat.");
    }
    
    private static void modificarNom(Nom[] llistaNoms)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom a modificar: ");
        String nomBuscat = sc.nextLine().toUpperCase();
    }
}