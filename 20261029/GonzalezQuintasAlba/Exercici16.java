/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici16;
import java.util.Scanner;

public class Exercici16 {


    public static void main(String[] args) {
        /* 16.	El programa permet anar introduint temperatures corporals de diferents pacients (valors reals).
Anira demanant temperatures fins que fiquis -1 que voldrà dir acabar.
Quan l’usuari decideixi finalitzar, el programa mostrarà:
La temperatura màxima registrada
La temperatura mínima
I la mitjana aritmètica de totes les temperatures introduïdes*/
        
        int cont=0;
        double num=0;
        double tempmax=0;
        double tempmin=0;
        double suma=0;
        double divisio=0;
        Scanner lector=new Scanner(System.in);
        do{
            System.out.println("Introduzca temperatura: ");
            num=lector.nextDouble();
            if(tempmax<num && num!=-1){
                tempmax=num;
            }
            if(num<tempmin && num!=-1){
                tempmin=num;
            }
            cont++;
            suma=suma+num;
        }while(num!=-1);
        suma=suma+1;
        cont=cont-1;
        System.out.println("suma: "+suma+"cont: "+cont);
        divisio=(suma)/(cont);
        System.out.println("La temperatura maxima es : "+ tempmax+" celsius ");
        System.out.println("La temperatura minima es: " + tempmin+ " celsius ");
        System.out.println("La media aritmetica es: " + divisio +" celsius");
            
    }
    
}
