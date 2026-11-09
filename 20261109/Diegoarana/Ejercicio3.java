package ejercicio3;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Exercici 3: Programa que demana a l'usuari dos números enters
 * i mostra quin és el menor.
 *
 * @author DIEGO ESTUDIOS
 */
public class Ejercicio3 {

    /**
     * Mètode principal: només s'encarrega de la interacció amb l'usuari.
     *
     * @param args arguments de la línia d'ordres
     */
    public static void main(String[] args) {
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
