/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dosnumerosoperacions;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class Dosnumerosoperacions {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner lector = new Scanner(System.in);
        System.out.print("Insertar Primer Numero: ");
        int  numero1 = lector.nextInt();
        System.out.print("Insertar Segon Numero: ");
        int numero2 = lector.nextInt();
        System.out.print("Inserta el operador: ");
        char operador = lector.next().charAt(0);
         System.out.format("Expressió a avaluar: %d %c %d\n",
            numero1, operador, numero2);      
        int result=0;  
        String missatge; 
        switch (operador) {
            case '+':
                result = numero1 + numero2;
                missatge = "resultat: "+result;
                break;
            case '-':
                result = numero1 - numero2;
                missatge = "resultat: "+result;
                break;
            case '*':
                result = numero1 * numero2;
                missatge = "resultat: "+result;
                break;
            case '/':
                result = numero1 / numero2;
                missatge = "resultat: "+result;
                break;
            default:
                missatge = "operació no vàlida";
                break;
        }
        System.out.println(missatge); 
    }
    
}
