/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pedrapapertisora;
import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author albagonzalezquintas1985
 */
public class Pedrapapertisora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Random naleatori=new Random();
    Scanner lector=new Scanner(System.in);
    int aleatori=naleatori.nextInt(0,3);
    System.out.println("Tirada ordinador: " + aleatori);
    System.out.println("Tria: 0.Pedra 1.Paper 2.Tisora");
    int opcio=lector.nextInt();
    if (opcio==aleatori){
        
        System.out.println("Empat");
                }
    else if(aleatori==0){
        if(opcio==2){
            System.out.println("Guanya ordinador");
        }
        else{
            System.out.println("Guanya jugador");
        }
    
    }
    else if(opcio==0){
            if(aleatori==2){
            System.out.println("Guanya jugador");
        }
        else{
            System.out.println("Guanya ordinador");
        }
    }
    else if(opcio==1){
        if(aleatori==0){
            System.out.println("Guanya jugador");
        }
        else{
            System.out.println("Guanya ordinador");
        }
    }
    else if(aleatori==1){
        if(opcio==0){
            System.out.println("Guanya ordinador");
        }
        else{
            System.out.println("Guanya jugador");
        }    
    }
    else if(aleatori==2){
        if(opcio==1){
            System.out.println("Guanya ordinador");
        }
        else{
            System.out.println("Guanya jugador");
    }    
    }
    else if(opcio==1){
        if(aleatori==0){
            System.out.println("Guanya jugador");
        }
        else{
            System.out.println("Guanya ordinador");
    }    
    }
    else{
            System.out.println("Opcio no valida");
    }
    }
    }


