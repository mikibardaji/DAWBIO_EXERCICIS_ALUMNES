/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exer9whwile.java;

/**
 *
 * @author iviss
 */
public class Exer9whwileJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

int suma = 0;
int i = 1;

while (i <= 5) {
    System.out.print("Introdueix pulsacions minut " + i + ": ");
    int pulsaciones = sc.nextInt();

    suma = suma + pulsaciones;

    i++;
}

double media = suma / 5.0;

System.out.println("Mitjana = " + media + " bpm");
    }
    
}
