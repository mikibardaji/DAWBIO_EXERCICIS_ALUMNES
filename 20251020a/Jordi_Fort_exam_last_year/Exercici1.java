/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg23.pkg10_exam_last_year;

import java.util.Scanner;

/**
 *
 * @author jfo9565
 */
public class Exercici1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);   
        
        float entrada = 0f,entradaDescuento = 0f;
        //temporada alta => temporada = 1,temporada baja => temporada = 2
        // adulto => tipo de cliente = 1, jubilado => tipo de cliente = 2
        int descuento = 0,tipoCliente,temporada;
        
        
        System.out.println("Introduce el precio de la entrada");
        entrada = sc.nextFloat();
        while (entrada <= 0){
            System.out.println("El precio de la entrada debe ser superior a 0");
            entrada = sc.nextFloat();
        }
        
        System.out.println("Que tipo de cliente es:\n1._Adulto\n2._Jubilado");
        tipoCliente = sc.nextInt();
        while (tipoCliente < 1 || tipoCliente > 2){
            System.out.println("Elige un tipo de cliente valido:\n1._Adulto\n2._Jubilado");
            tipoCliente = sc.nextInt();
        }
       
            System.out.println("Que temporada es:\n1._Alta\n2._Baja");
            temporada = sc.nextInt();
        while (temporada < 1 || temporada > 2){
            System.out.println("Elige una opcion de temporada valida:\n1._Alta\n2._Baja");
            temporada = sc.nextInt();
        }
        
        
        /*Elegi switch porque cada vez que tengas que escoger una opcion de 
        entre varias es mejor el switch frente a el if*/
        
        switch (temporada) {
            case 1:
                if (tipoCliente == 1) {
                    descuento = 0;
                    entradaDescuento = entrada;
                    
                }else if(tipoCliente == 2){
                    descuento = 10;
                    entradaDescuento = entrada * 90 / 100;
                    
                }/*else{
                    System.out.println("Elige un tipo de cliente valido");
                }*/
                
                break;
                
            case 2:
                if (tipoCliente == 1) {
                    descuento = 5;
                    entradaDescuento = entrada * 95 / 100;
                    
                }else if(tipoCliente == 2){
                    descuento = 15;
                    entradaDescuento = entrada * 85 / 100;
                    
                }/*else{
                    System.out.println("Elige un tipo de cliente valido");
                }*/
                
                break;
                
            default:
                //System.out.println("Elige una tipo de temporada que sea valida");
        }
        System.out.println("*Precio entrada normal: " + entrada + "$");
        System.out.println("*Temporada: " + temporada);
        System.out.println("*Tipo de cliente: " + tipoCliente);
        System.out.println("*Descuento: " + descuento + "%");
        System.out.println("*Entrada con descuento" + entradaDescuento + "$");
        
    }
    
}
