/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package funcions4;

import java.util.Scanner;

/**
 *
 * @author jlu1859
 */
public class Funcions4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner lector = new Scanner(System.in);
        System.out.println("Entra un numero: ");
        int x = lector.nextInt();
        System.out.println("el teu numero es: " + obteSigne(x));   
       
    }
public static int obteSigne(int x){
    int obteSigne;
    if(x<0){
        obteSigne = -1;
    } else if(x>1) {
        obteSigne = 1;
    } else{
        obteSigne = 0;
    } return obteSigne;
}
}

