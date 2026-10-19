/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici1dowhile;
import java.util.*;
/**
 *
 * @author ago4635
 */
public class Exercici1Dowhile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1.	Escriu un programa que mostri per pantalla els números del 1 al 10, representant el recompte de glòbuls vermells analitzats per un microscopi.
    int cont=0;
    do{
        System.out.println("Mostrant globul"+(cont+1));
        cont=cont+1;
    }while(cont<10);
         
    }
    
}

