/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ex3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author guill
 */
public class Ex3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    int limit_Min = 1, limit_Maximo;
    Scanner sc = new Scanner(System.in);
    Random rd = new Random();
    int aciertos= 0, errores = 0;
    boolean seguir = true;
        
        System.out.println("Cual sera el valor absoluto que indicaras");        
        limit_Maximo = sc.nextInt();
        sc.nextLine();
        
        do {
            
        
        int num1 = rd.nextInt(limit_Maximo - limit_Min-1) + (limit_Min +1);
        int num2 = rd.nextInt(limit_Maximo - limit_Min-1) + (limit_Min +1);
            System.out.println("cuanto es la suma de:\n "+num1+ "\n y de :\n "+num2);
        int suma = num1 + num2;
        int respuesta_Usuario;
            System.out.println("apunta tu respuesta");
            respuesta_Usuario = sc.nextInt();
            sc.nextLine();
            
        if (respuesta_Usuario == suma) {
                System.out.println("Has acertado");
                aciertos++;
        }else if(respuesta_Usuario != suma){
            System.out.println("has fallado");
            errores ++;
            
            System.out.println("Si fallas 3 veces pierdes");
            System.out.println("errores total: "+errores);

        }if (errores == 3) {
                System.out.println("Has perdido");
                seguir = false;
            }
            String respuesta;
            System.out.println("Deseas continuar indica :\n (S/N)");
            respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("s")) {
                System.out.println("continuemos...");
                seguir = true;
            }else if (respuesta.equalsIgnoreCase("n")) {
                System.out.println("Hasta luego");
                seguir = false;
            }else{
                System.out.println("Caracter invalido");
            }
        } while (seguir == true && errores <= 3);
        
        System.out.println("total de aciertos : \n"+ aciertos);
        System.out.println(" total de errores: \n" +errores);
    }
    
}
