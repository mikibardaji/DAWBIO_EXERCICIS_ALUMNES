/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.diferenciadinero;
import java.util.Scanner;
/**
 *
 * @author albagonzalezquintas1985
 */
public class Diferenciadinero {

    public static void main(String[] args) {
        double precio,diferencia, paga=0;
        Scanner lector=new Scanner(System.in);
        System.out.println("Introduzca el precio del producto: ");
        precio=lector.nextDouble();
        System.out.println("Introduce el dinero que has dado: ");
        paga=lector.nextDouble();
        diferencia=(precio-paga);
        if(diferencia>0){
            System.out.println("Tienes que pagar el restante del precio de producto que es "+ diferencia+"euros");
        }
        else if(diferencia<0){
            System.out.println("Tienen que devolverte "+ (-diferencia)+"euros");
        }
        else{
            System.out.println("No tienes ni que pagar ni devolver");
        }
    }
}
