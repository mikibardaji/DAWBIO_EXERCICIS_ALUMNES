/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package a2;

import java.util.Scanner;

/**
 *
 * @author jbl3198
 */
public class BlascoJoelEx6mod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero1 = pedirNum();
        int numero2 = pedirNum();
        int compara = compara(numero1, numero2);

        resultado(compara, numero1, numero2);
    }

    private static int compara(int x, int y){
        int compara;
        if(x != y){
            if(x < y){
                compara = -1;
            }
            else{
                compara = 1;
            }
        }
        else{
            compara = 0;
        }
        return compara;
    }
    
    private static int pedirNum(){
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Posa un numero: ");

        int num = sc.nextInt();
        
        return num;
    }
    
    private static void resultado(int comp, int x, int y){
        switch(comp){
            case -1:
                System.out.println(x + " es mes petit que " + y);
                break;
            case 0:
                System.out.println(x + " i " + y + " son iguals!");
                break;
            case 1:
                System.out.println(x + " es mes gran que " + y);
                break;
            default:
                System.out.println("ERROR!!");
                break;
        }
    }
    
    
}
