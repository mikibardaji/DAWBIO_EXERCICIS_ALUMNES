/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dsmexmodular3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author dsa1845
 */
public class DSMExModular3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 3. Programa que demana a l’usuari dos números enters i mostra quin és el menor. 
        // Cal implementar i usar el mètode int menor(int x, int y), el qual retorna el menor dels dos passats com a paràmetres.        
        Scanner lector = new Scanner(System.in);
        
        try{
            System.out.println("Introdueix dos numero i et dire quin es el menor: ");
            System.out.print("Nombre x: ");
            int x = lector.nextInt();
            System.out.print("Nombre y: ");
            int y = lector.nextInt();
            
            int resultat = menor(x,y);
            
            if(x==y){
                System.out.println("Valen el mateix, el numero es: " + x + " .");
            }else{
            System.out.println("El numero menor es: " + resultat + " .");
            }
            
        }catch(InputMismatchException e){
            System.out.println("Has d'introduir un nombre enter.");
        }
        
    }
    
    public static int menor(int x, int y){
        int menor;
        if (x<y){
            menor = x;
        }
        else {
            menor = y;
        }
        return menor;
    }
    
}
