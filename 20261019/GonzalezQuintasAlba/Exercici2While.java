/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici.pkg2.pkgwhile;
import java.util.Scanner;
/**
 *
 * @author ago4635
 */
public class Exercici2While {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Un pacient ha de prendre n dosis d’un medicament, fes un simulacre que et pregunti quantes dosis necessites i et mostri cada hora (volta) quantes et queden
        
        Scanner lector=new Scanner(System.in);
        int cont;
        int dosis;
        System.out.print("Introduzca numero de dosis: ");
        dosis=lector.nextInt();
        cont=dosis-1;
        while(cont>=0){
            System.out.println("Dosis administrada t’en falten "+cont);
            cont--;
        }
        System.out.println("Ja t'has curat");
    }
    
}
