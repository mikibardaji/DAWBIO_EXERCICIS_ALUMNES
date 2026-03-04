/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaamics;
import Objectes.Amic;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
/**
 *
 * @author sorsh
 */
public class AgendaAmics {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InputMismatchException {
        Scanner sc = new Scanner(System.in);
        List<Amic> agenda; //per aprofitar polimorfisme
        agenda = new ArrayList<>(); //implementació especifica
        int opcio = 0;
        int id=0;
        
        do {
            System.out.println("\n--- AGENDA D'AMICS ---");
            System.out.println("1.- Afegir Amic");
            System.out.println("2.- Llistar Amics");
            System.out.println("3.- Esborrar Amic");
            System.out.println("4.- Sortir");
            System.out.print("Elegeix una opció: ");
            try {
            opcio = sc.nextInt();
            sc.nextLine(); // Netegar el buffer
            
            switch (opcio) {
                case 1:
                    System.out.println("Has triat: Afegir Amic");
                    // --- EL TEU CODI AQUÍ PARA AFEGIR A L'ARRAYLIST ---
                    AfegirAmic(agenda,sc, id);
                    id++;
                    break;

                case 2:
                    System.out.println("Has triat: Llistar Amics");
                    // --- EL TEU CODI AQUÍ PER RECORRER I MOSTRAR LA LLISTA ---
                    LlistarAgenda(agenda);
                    break;

                case 3:
                    System.out.println("Has triat: Esborrar Amic");
                    // --- EL TEU CODI AQUÍ PER ELIMINAR UN AMIC (Pots fer servir el telèfon) ---
                    EsborrarAmic(agenda,sc);
                    break;

                case 4:
                    System.out.println("Adeu! Tancant l'agenda...");
                    break;

                default:
                    System.out.println("Opció no vàlida.");
            }
        } catch (InputMismatchException e) {
                System.out.println("ERROR: Has d'introduir un número sencer.");
                sc.nextLine();
                opcio = 0; // Reiniciem l'opció per continuar el bucle
        }
        } while (opcio != 4);
        
        sc.close();
    }
    
 public static void AfegirAmic(List<Amic> agenda,Scanner sc, int id)
    {
        System.out.println("Nom del teu amic:");
        String nom = sc.nextLine();
        System.out.println("Telèfon del teu amic:");
        String telefon = sc.nextLine();
        agenda.add(new Amic(id,nom, telefon));
        
       
    }    
    
 public static void LlistarAgenda(List<Amic> agenda)
    {   
    
     System.out.println("Amics a l'agenda: " + agenda.size());
        for (Amic pet : agenda) { //for each (Iterable)
            System.out.println(pet);
        }
}
 
 public static void EsborrarAmic(List<Amic> agenda,Scanner sc)
    {   
    System.out.println("Id del registre que vols esborrar:");
    int id = sc.nextInt();
    Amic antic = new Amic(id,"","");
    if (agenda.remove(antic))
            System.out.println("Borrant registre");
        else
            System.out.println("No existeix el registre sel·lecionat");
       
}
    
}
