/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication3;

/**
 *
 * @author agu3018
 */
public class QuintoEjercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cont;
        System.out.println("Cuenta atras de la cirugia");
        System.out.println("Preparando quirofano: ");
        for (cont = 10; cont >=0; cont--) {
            if(cont!=0){
                System.out.println(cont);
            } else {
                System.out.println("Inicio de Intervencion");
            }
        }
    }
    
}
