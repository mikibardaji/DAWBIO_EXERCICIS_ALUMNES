/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package parellosenar;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author ago4635
 */
public class Parellosenar {


    public static void main(String[] args) {
        //. Parell o senar
/*Fes un programa que generi aleatòriament un número entre 1 i 100.
El programa ha de mostrar el número generat i indicar si és:
•	Parell
•	Senar
Pista: pots utilitzar l’operador %, revisa per a que serveix.
Pista:  un numero es divisible per un numero, si el seu residu és 0.*/
    Random numaleatori=new Random();
    Scanner lector=new Scanner(System.in);
    int aleatori=numaleatori.nextInt(1,101);
    System.out.println("El valor aleatorio es: "+aleatori);
    if(aleatori%2==0){
        System.out.println("El valor aleatorio generado es par");

    }
    else{
        System.out.println("El valor aleatorio generado es impar");
    }
    }
    
}
