/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bucles;
import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author mca3765
 */
public class Bucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce 10 valores de presión arterial:");
        int i =1;
        int negativo = 0;
        do{
            System.out.println("Valor " +i+":");
            int presion = lector.nextInt();
            i++;
            if (presion==0){
                System.out.println("Valor no vàlido, introduce un valor no nulo");
                i--;
            }
            else if (presion < 0){
                negativo ++;
            }
        } while(i<=10);
        if (negativo !=0) {
            System.out.println("Se han detectado "+negativo+" valor(es) críticos");
        } else {
            System.out.println("Todo correcto");
        }
        
        }
        
    }
    

