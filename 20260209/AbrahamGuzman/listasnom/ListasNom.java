/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasnom;

import java.util.Scanner;
import objetos.Nom;

/**
 *
 * @author xabiel
 */
public class ListasNom {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Declaración e inicialización del array con 10 posiciones
        Nom[] nombres = {
            new Nom("Ana"), 
            new Nom("Luis"), 
            new Nom(),        // Constructor vacío
            new Nom("Marta"), 
            new Nom("Juan"), 
            new Nom("Sofía"), 
            new Nom(),        // Vacío
            new Nom("Pablo"), 
            new Nom("Lucía"), 
            new Nom()         // Vacío
        };

        char opcio;
        Scanner scanner = new Scanner(System.in);

        do {
            mostrarMenu();
            opcio = obtenirOpcioUsuari(scanner);

            switch (opcio) {
                case 'a':
                    Llistarnoms(nombres);
                    break;
                case 'b':
                    afegirNom(nombres, scanner);
                    break;
                case 'c':
                    modificarNom(nombres, scanner);
                    break;
                case 'd':
                    cercarNom(nombres, scanner);
                    break;
                case 'e':
                    esborrarNom(nombres, scanner);
                    break;
                case 'g':
                    inserirNomEnPosicio(nombres, scanner);
                    break;
                case 'f':
                    System.out.println("Sortint del programa. Adeu!");
                    break;
                default:
                    System.out.println("Opció no vàlida. Torna a intentar.");
            }

        } while (opcio != 'f');
        
        scanner.close();
    }

    private static void mostrarMenu() {
        System.out.println("\n========== MENÚ ==========");
        System.out.println("a. Llistar noms");
        System.out.println("b. Afegir nom (a la primera posició lliure)");
        System.out.println("c. Modificar nom");
        System.out.println("d. Cercar un nom");
        System.out.println("e. Esborrar nom");
        System.out.println("f. Sortir");
        System.out.println("g. Inserir nom en posició concreta");
        System.out.println("==========================");
    }

    private static char obtenirOpcioUsuari(Scanner scanner) {
        System.out.print("Selecciona una opció (a-f): ");
        return scanner.next().toLowerCase().charAt(0);
    }

private static void Llistarnoms(Nom[] nombres) {
    for (int i = 0; i < nombres.length; i++) {
        if (nombres[i].isOcupat()) {
            System.out.println("Posición " + i + ": " + nombres[i].toString());
        } else {
            System.out.println("La posicion " + i + " " + nombres[i].toString());
        }
    }
}

    private static void afegirNom(Nom[] nombres, Scanner scanner) {
        System.out.println("\n--- AFEGIR NOM ---");
        for (int i = 0; i < nombres.length; i++) {
            if (!nombres[i].isOcupat()) {
                System.out.print("Introdueix el nou nom: ");
                String nouNom = scanner.next();
                nombres[i].setNom(nouNom);
                System.out.println("Nom '" + nouNom + "' afegit a la posició " + i);
                return;
            }
        }
        System.out.println("No hi ha posicions lliures!");
    }

    private static void modificarNom(Nom[] nombres, Scanner scanner) {
        System.out.println("\n--- MODIFICAR NOM ---");
        System.out.print("Introdueix la posició a modificar (0-9): ");
        int pos = scanner.nextInt();
        
        if (pos < 0 || pos >= nombres.length) {
            System.out.println("Error: La posició ha de ser entre 0 i 9");
            return;
        }
        
        if (nombres[pos].isOcupat()) {
            System.out.println("Nom actual: " + nombres[pos].getNom());
            System.out.print("Nou nom: ");
            String nouNom = scanner.next();
            nombres[pos].setNom(nouNom);
            System.out.println("Nom modificat correctament!");
        } else {
            System.out.println("Aquesta posició està buida. Vols afegir un nom? (s/n)");
            char resposta = scanner.next().toLowerCase().charAt(0);
            if (resposta == 's') {
                System.out.print("Introdueix el nom: ");
                String nouNom = scanner.next();
                nombres[pos].setNom(nouNom);
                System.out.println("Nom afegit!");
            }
        }
    }

    private static void cercarNom(Nom[] nombres, Scanner scanner) {
        System.out.println("\n--- CERCAR NOM ---");
        System.out.print("Introdueix el nom a cercar: ");
        String nomACercar = scanner.next();
        boolean trobat = false;
        
        for (int i = 0; i < nombres.length; i++) {
            if (nombres[i].isOcupat() && nombres[i].getNom().equalsIgnoreCase(nomACercar)) {
                System.out.println("Trobat! El nom '" + nomACercar + "' està a la posició " + i);
                trobat = true;
            }
        }
        
        if (!trobat) {
            System.out.println("El nom '" + nomACercar + "' no s'ha trobat.");
        }
    }

    private static void esborrarNom(Nom[] nombres, Scanner scanner) {
        System.out.println("\n--- ESBORRAR NOM ---");
        System.out.print("Introdueix la posició a esborrar (0-9): ");
        int pos = scanner.nextInt();
        
        if (pos < 0 || pos >= nombres.length) {
            System.out.println("Error: La posició ha de ser entre 0 i 9");
            return;
        }
        
        if (nombres[pos].isOcupat()) {
            System.out.print("Estàs segur d'esborrar '" + nombres[pos].getNom() + "'? (s/n): ");
            char resposta = scanner.next().toLowerCase().charAt(0);
            if (resposta == 's') {
                nombres[pos].setNomBuit();
                System.out.println("Nom esborrat!");
            } else {
                System.out.println("Operació cancel·lada.");
            }
        } else {
            System.out.println("Aquesta posició ja està buida.");
        }
    }

    private static void inserirNomEnPosicio(Nom[] nombres, Scanner scanner) {
        System.out.println("\n--- INSERIR NOM ---");
        System.out.print("Introdueix la posició (0-9): ");
        int pos = scanner.nextInt();
        
        if (pos < 0 || pos >= nombres.length) {
            System.out.println("Error: La posició ha de ser entre 0 i 9");
            return;
        }
        
        System.out.print("Introdueix el nom: ");
        String nouNom = scanner.next();
        
        nombres[pos].setNom(nouNom);
        System.out.println("Nom '" + nouNom + "' inserit a la posició " + pos);
    }
/*
    public static void separarPalabra(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra de mas de 2 espacios");
        String frase = sc.nextLine();       
        String [] palabra = frase.split(" ");
        for (int i = 0; i < palabra.length; i++) {
            System.out.println(palabra[i]);
        }
         
 
    }
    
    public static void palabraIgual(){
         Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra");
        String palabra1 = sc.next();
        System.out.println("Ingrese una palabra");
        String palabra2 = sc.next();
       
        if(palabra1.toLowerCase().equals(palabra2.toLowerCase())){
        
            System.out.println("La palabra es la misma " + palabra1);
        } else {
        
            System.out.println("La palabra "+ palabra1 + " y la palabra "+palabra2);
        }
       
    
    }
    
    public static void Treasprimeras(){
    Scanner sc = new Scanner(System.in);
        System.out.println("Dame tu nombre");
        String Nombre = sc.next();
         System.out.println("Dame tu apellido");
        String Apellido  = sc.next();;
         System.out.println("Dame tu apellido");
        String Apellido2  = sc.next();
    
        
        String palabralocas = Nombre.substring(0, 3) + Apellido.substring(0, 3)+ Apellido2.substring(0, 3);
       
        
        System.out.println(palabralocas);
    
    }

    public static void ContarVocales(){
    Scanner teclado = new Scanner(System.in);
        
        System.out.println("Introduce una frase:");
        String frase = teclado.nextLine();
        
        // 1. Convertimos a minúsculas para facilitar la comparación
        frase = frase.toLowerCase();
        
        // 2. Declaramos los contadores
        int a = 0, e = 0, i = 0, o = 0, u = 0;
        
        // 3. Recorremos la frase
        for (int x = 0; x < frase.length(); x++) {
            char letraActual = frase.charAt(x);
            
            // 4. Clasificamos la letra
            switch (letraActual) {
                case 'a': a++; break;
                case 'e': e++; break;
                case 'i': i++; break;
                case 'o': o++; break;
                case 'u': u++; break;
            }
        }
        
        // 5. Mostramos los resultados
        System.out.println("Nº de A's: " + a);
        System.out.println("Nº de E's: " + e);
        System.out.println("Nº de I's: " + i);
        System.out.println("Nº de O's: " + o);
        System.out.println("Nº de U's: " + u);
        
        
    }
    */
    
    
}
