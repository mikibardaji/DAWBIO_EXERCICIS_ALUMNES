/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package notaasig;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class NotaAsig {

    /**
     * Programa que demani dues notes d’una assigantura (amb decimals). 
     * Si alguna de les dues es mes petita que 5 ha de sortir el text «Has d’anar a 
     * segona convocatoria». Si no ha de dir «Felicitats, modul superat»
     */
    public static void main(String[] args) {
        // declaramos y llamamos al lector
        Scanner lector = new Scanner(System.in);
        double nota1;
        double nota2;
        
        //escribimos
        System.out.println("Notas de Asignaturas");
        System.out.println("nota 1 : ");
        nota1 = lector.nextDouble();
        
        System.out.println("nota 2 : ");
        nota2 = lector.nextDouble();
        
        //if else
        if(nota1 < 5 || nota2 <  5 ){ // ||-OR  &&-AND 
            System.out.println("Tienes que venir a la segunda convocatoria: " + nota1 + nota2);
        }else{
            System.out.println("Felicidades modulo superado " + nota1 + nota2);
        }
        
    
    
    
    
    
    
    
    
    }
    
}
