/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;
import java.util.Scanner;

public class Ejercicio12 {
    
    public static float calculardescuento(float precio, float precio_descuento){
        float descuento=0;
        descuento=((precio-precio_descuento)/precio)*100;
        return descuento;
    }

    public static void main(String[] args) {
        float preu,preu_descompte=0;
        float descompte=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el precio sin descuento : ");
        preu=lector.nextFloat();
        System.out.println("Introduzca el precio con descuento: ");
        preu_descompte=lector.nextFloat();
        descompte=calculardescuento(preu,preu_descompte);
        System.out.println("El descuento es " + descompte + " % ");        
    }
    
}
