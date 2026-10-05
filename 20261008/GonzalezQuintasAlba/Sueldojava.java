/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sueldojava;

import java.util.Scanner;

/**
 *
 * @author albagonzalezquintas1985
 */
public class Sueldojava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int hores=0;
double impuestos,sueldo=0;
System.out.println("Introduzca el numero de horas trabajadas al mes ");
Scanner lector= new Scanner(System.in);
hores=lector.nextInt();

if (hores<=130){
    sueldo=hores*15; 
    if(sueldo<0500){
        System.out.println ("El sueldo neto es "+sueldo);}
    else if (sueldo>500 && sueldo <=900){
        System.out.println("El sueldo neto es " + (sueldo*0.75));}
    else if (sueldo>900){
        System.out.println("El sueldo neto es " + ((400*0.75)+(sueldo-400)*0.55));}
}
      
else if(hores>130){
    sueldo=130*15;
    sueldo= sueldo + (22.5*(hores-130));
       if(sueldo<0500){
        System.out.println ("El sueldo neto es "+sueldo);}
    else if (sueldo>500 && sueldo <=900){
        System.out.println("El sueldo neto es " + (sueldo*0.75));}
    else if (sueldo>900){
        System.out.println("El sueldo neto es " + ((400*0.75)+(sueldo-400)*0.55)+"euros");}
}


        
    }
    }
    
}
