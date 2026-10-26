/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercici15;


public class Exercici15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // 15.	Programa que mostra totes les taules de multiplicar entre 1 i 9.
        int result;
        for(int i=1;i<=9;i++){
            System.out.println("Tabla de multiplicar del numero "+ i);
            for(int j=0;j<=10;j++){
                result=i*j;
                System.out.println(i + " x " + j + " = "+ result);
            }
        
    }
    }
    
}
