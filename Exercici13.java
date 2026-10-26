/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici13;
import java.util.Random;
import java.util.Scanner;

public class Exercici13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*13.	Programa on l’ordinador pensa un número (aleatòriament) entre 1 i 100 i l’usuari intenta endevinar-lo. El programa demanarà de forma iterativa a l’usuari que entri números i indicarà si el número a endevinar és més gran o més petit. El programa acaba quan l’usuari endevina el número i s’haurà de mostrar el nombre d’intents que s’han utilitzat.*/
    int numaleatorio=0;
    Random aleatorio= new Random();
    numaleatorio=aleatorio.nextInt(1,101);
    int num=0;
    int cont=0;
        do{
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca numero entre 1 y 100 : ");
        num=lector.nextInt();
        System.out.println("El valor aleatorio a adivinar es "+numaleatorio+" y hemos introducido "+num);
        }while(numaleatorio!=num);
    System.out.println("Ya has acertado!");
    }
    
}
