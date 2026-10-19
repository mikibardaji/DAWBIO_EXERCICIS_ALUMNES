/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex1bucles;

/**
 *
 * @author ama5753
 */
public class Ex1Bucles {

    /**
     * @param args the command line arguments
     * 1. Escriu un programa que mostri per pantalla els números del 1 al 10, 
     * representant el recompte de glòbuls vermells analitzats per un microscopi.
        1. Sortida esperada:
        2. Mostrant glòbul 1
        3. Mostrant glòbul 2
        4. ...
        5. Mostrant glòbul 10
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int contador_i = 2, globul = 1;
        
        System.out.println("1. Sortida esperada: ");
        
        while (globul <=10){
            System.out.println(contador_i + "." + " Mostrant globul " + globul);
            contador_i = contador_i+1;
            globul = globul+1;
            
        }
        System.out.println("");
        
    }
    
}
