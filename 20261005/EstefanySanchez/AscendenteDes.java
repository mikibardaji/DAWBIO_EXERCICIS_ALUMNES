/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ascendentedes;
import java.util.Scanner;
/**
 *
 * @author esa7092
 */
public class AscendenteDes {

    /**
     * 
     *Programa que llegeix dos números i 
     *els visualitza en ordre ascendent.
     * 
     */
    public static void main(String[] args) {
        //declaramos variable
        Scanner lector = new Scanner(System.in);
        int numero1;
        int numero2;
        
        //Escribimos
        System.out.println("Ingresa el primer numero: ");
        numero1 = lector.nextInt();
        
        System.out.println("Ingresa el segundo numero: ");
        numero2 = lector.nextInt();
        
        //comparamos usando if else
        //Ascendentes
        if(numero1 <= numero2){
            System.out.print(numero1 + "," + numero2);//comprobamos el primernumero
            
            
        }else{
            System.out.print(  numero2 + "," + numero1);
        }
        
    
    
    
    
    
    
    
    }
    
}
