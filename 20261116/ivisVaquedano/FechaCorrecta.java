/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fechacorrecta;

import java.util.Scanner;

/**
 *
 * @author iviss
 */
public class FechaCorrecta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          Scanner sc =new Scanner(System.in);
        System.out.println("Validador de fecha");
        
        System.out.println("Introduce el año: ");
        int any=sc.nextInt();
        
        System.out.println("introduce el mes: ");
        int mes=sc.nextInt();
        
        System.out.println("Introduce el dia: ");
        int dia=sc.nextInt();
        
        boolean resultado = fechaCorrecta(any, mes, dia);
        
        if (resultado){
            System.out.println("La fecha es correcta");
        }else{
            System.out.println("la fecha es incorrecta : ");
    }
   
}
         
   public static boolean fechaCorrecta(int any, int mes, int dia) {
    boolean anyCorrecto = any > 0;
    boolean mesCorrecto = mes >= 1 && mes <= 12; 
    boolean diaCorrecto = dia >= 1 && dia <= 30;
    
  return anyCorrecto && mesCorrecto && diaCorrecto;
}
}