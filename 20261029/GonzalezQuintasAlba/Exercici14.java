/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici14;
import java.util.Random;
import java.util.Scanner;
public class Exercici14 {

    public static void main(String[] args) {
        /*14.	Programa on l'usuari pensa un número de l'1 al 100 i l'ordinador intenta endevinar-lo. És a dir, l'ordinador anirà proposant números una vegada i una altra fins a endevinar-lo (l'usuari haurà d'indicar-li a l'ordinador si és més gran, menor o igual al número que ha pensat).   */
    int numaleatorio=0;
    Random aleatorio= new Random();
    int num=0;
    int cont=0;
    Scanner lector=new Scanner(System.in);
    System.out.println("Introduzca numero entre 1 y 100 : ");
    num=lector.nextInt();
        do{
           numaleatorio=aleatorio.nextInt(1,101);
           System.out.println("El valor aleatorio a adivinar es "+numaleatorio+" y hemos introducido "+num);
           if(num==numaleatorio){
               System.out.println("Los numeros son iguales");
           }
           else if (num<numaleatorio){
               System.out.println("El numero introducido por el usuario es menor que el aleatorio");
           }
           else{
               System.out.println("El numero introducido por el usuario es mayor que el aleatorio");
           }
        }while(numaleatorio!=num);
    System.out.println("Ya has acertado! Fin");
    }
    
    }
    

