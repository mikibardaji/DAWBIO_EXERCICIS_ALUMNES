/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package comptadorglobuswhile;

/**
 *
 * @author alumne
 */
public class Comptadorglobuswhile {

    /**
     * Programa que muestra el recompte de 10 glòbuls vermells utilitzant un bucle while
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //iniciamos el contador antes del bucle
        int i = 1;
        
        //se ejecuta mientras i sea menor o igual a 10
        while (i <= 10) {
            System.out.println("Mostrant globul " + i);
            
        //actualizacion del contador para evitar un bucle infinito
        i++;
            
            
        }
        
    }
    
}

